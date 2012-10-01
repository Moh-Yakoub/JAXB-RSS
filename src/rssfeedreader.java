
import java.net.URL;
import java.util.Date;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class rssfeedreader {
	public static void main(String args[]) throws Exception {
		JAXBContext context = JAXBContext.newInstance(rss.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		rss r = (rss) unmarshaller.unmarshal(new URL(
				"rss_feed_url_goes_here"));
		List<item> items = r.c.items;
		System.out.println(r.c.description);

		int max = 0;
		for (int i = 1; i < items.size(); i++)
			if (items.get(i).getDate() > items.get(max).getDate())
				max = i;
		System.out.println(items.get(max).title);

	}

}
