package org.firstinspires.ftc.ftcdevcommon.xml;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.function.Consumer;

public class XMLUtils {

    public static void processElements(NodeList pNodeList, Consumer<Element> pProcessElement) {
        Node oneNode;
        for (int i = 0; i < pNodeList.getLength(); i++) {
            oneNode = pNodeList.item(i);

            if (oneNode.getNodeType() != Node.ELEMENT_NODE)
                continue;

            pProcessElement.accept((Element) oneNode);
        }
    }

    public static Node getNextElement(Node pNode) {
        Node nd = pNode;
        while (nd != null) {
            if (nd.getNodeType() == Node.ELEMENT_NODE) {
                return nd;
            }
            nd = nd.getNextSibling();
        }
        return null;
    }

}
