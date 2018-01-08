package org.gitlab.api;

import java.io.IOException;
import java.net.URL;

/**
 * @author chunhua.xu
 * @date 2018/1/8
 */
public class GitlabAPIV3 extends GitlabAPI{
    private static final String API_NAMESPACE = "/api/v3";

    GitlabAPIV3(String hostUrl, String apiToken, TokenType tokenType, AuthMethod method) {
        super(hostUrl, apiToken, tokenType, method);
    }

    public URL getAPIUrl(String tailAPIUrl) throws IOException {
        if (!tailAPIUrl.startsWith("/")) {
            tailAPIUrl = "/" + tailAPIUrl;
        }
        return new URL(getHostUrl() + API_NAMESPACE + tailAPIUrl);
    }
}
