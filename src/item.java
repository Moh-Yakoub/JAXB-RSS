

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="item")
public class item {
	String title;
	String link;
	String description;
	String author;
	String category;
	String comments;
	String enclosure;
	String guid;
	String pubDate;
	String source;
	
	public long getDate(){
		if(pubDate!=null)return new Date().parse(pubDate);
		else return -1;
	}

}
