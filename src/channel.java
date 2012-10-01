
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="channel")

public class channel {
	@XmlElement(name="item")
	ArrayList<item> items = new ArrayList<item>();
	String title;
	String link;
	String description;
	channelimage image;
	

}
