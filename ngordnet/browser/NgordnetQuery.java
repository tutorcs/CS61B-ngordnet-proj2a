https://tutorcs.com
WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
package ngordnet.browser;

import java.util.List;

/**
 * Created by hug.
 */
public record NgordnetQuery(List<String> words,
        int startYear,
        int endYear,
        int k) {
}
