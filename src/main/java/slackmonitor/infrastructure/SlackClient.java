

import com.github.seratch.jslack.Slack;
import com.github.seratch.jslack.api.webhook.Payload;
import com.github.seratch.jslack.common.http.SlackHttpClient;
import okhttp3.OkHttpClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;

@Component
public class SlackClient {

    @SuppressWarnings("unused")
    @Value("${proxy.host}")
    private String host;

    @SuppressWarnings("unused")
    @Value("${proxy.port}")
    private int port;

    @SuppressWarnings("unused")
    @Value("${slack.endpoint}")
    private String endpoint;

    public void sendMessage(String channel, String userName, String text) {
        try {
        Proxy proxyValue = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(host, port));
        OkHttpClient.Builder builder = new OkHttpClient.Builder().proxy(proxyValue);
        OkHttpClient client = builder.build();
        Payload payload = Payload.builder().channel(channel).username(userName).iconEmoji(":negative_squared_cross_mark:").text(text).build();
        Slack slack = Slack.getInstance(new SlackHttpClient(client));
        slack.send(endpoint, payload);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
