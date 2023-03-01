https://tutorcs.com
WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
package ngordnet.main;

import ngordnet.browser.NgordnetQuery;
import ngordnet.browser.NgordnetQueryHandler;

import java.util.List;

public class DummyHistoryTextHandler extends NgordnetQueryHandler {
    @Override
    public String handle(NgordnetQuery q) {
        List<String> words = q.words();
        int startYear = q.startYear();
        int endYear = q.endYear();

        String response = "You entered the following info into the browser:\n";
        response += "Words: " + q.words() + "\n";
        response += "Start Year: " + q.startYear() + "\n";
        response += "End Year: " + q.endYear() + "\n";
        return response;
    }
}
