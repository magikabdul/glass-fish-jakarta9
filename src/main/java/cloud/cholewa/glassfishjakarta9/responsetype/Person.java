package cloud.cholewa.glassfishjakarta9.responsetype;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public record Person(String name, int age) {
}
