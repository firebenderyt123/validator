/* This code was generated by nu.validator.tools.SaxCompiler. Please regenerate instead of editing. */
package nu.validator.servlet;
public final class PageEmitter {
private PageEmitter() {}
public static void emit(org.xml.sax.ContentHandler contentHandler, nu.validator.servlet.VerifierServletTransaction t) throws org.xml.sax.SAXException {
org.xml.sax.helpers.AttributesImpl __attrs__ = new org.xml.sax.helpers.AttributesImpl();
try {
contentHandler.startDocument();
contentHandler.startPrefixMapping("", "http://www.w3.org/1999/xhtml");
__attrs__.clear();
contentHandler.startElement("http://www.w3.org/1999/xhtml", "html", "html", __attrs__);
__attrs__.clear();
contentHandler.startElement("http://www.w3.org/1999/xhtml", "head", "head", __attrs__);
__attrs__.clear();
__attrs__.addAttribute("", "rel", "rel", "CDATA", "stylesheet");
__attrs__.addAttribute("", "href", "href", "CDATA", "http://hsivonen.iki.fi/style/validator.css");
contentHandler.startElement("http://www.w3.org/1999/xhtml", "link", "link", __attrs__);
contentHandler.endElement("http://www.w3.org/1999/xhtml", "link", "link");
__attrs__.clear();
__attrs__.addAttribute("", "type", "type", "CDATA", "text/javascript");
__attrs__.addAttribute("", "src", "src", "CDATA", "http://hsivonen.iki.fi/script/validator.js");
contentHandler.startElement("http://www.w3.org/1999/xhtml", "script", "script", __attrs__);
contentHandler.endElement("http://www.w3.org/1999/xhtml", "script", "script");
__attrs__.clear();
contentHandler.startElement("http://www.w3.org/1999/xhtml", "title", "title", __attrs__);
t.emitTitle(false); 
contentHandler.endElement("http://www.w3.org/1999/xhtml", "title", "title");
contentHandler.endElement("http://www.w3.org/1999/xhtml", "head", "head");
__attrs__.clear();
__attrs__.addAttribute("", "onload", "onload", "CDATA", "boot()");
contentHandler.startElement("http://www.w3.org/1999/xhtml", "body", "body", __attrs__);
__attrs__.clear();
contentHandler.startElement("http://www.w3.org/1999/xhtml", "h1", "h1", __attrs__);
t.emitTitle(true); 
contentHandler.endElement("http://www.w3.org/1999/xhtml", "h1", "h1");
t.emitForm(); t.validate(); 
__attrs__.clear();
contentHandler.startElement("http://www.w3.org/1999/xhtml", "hr", "hr", __attrs__);
contentHandler.endElement("http://www.w3.org/1999/xhtml", "hr", "hr");
__attrs__.clear();
contentHandler.startElement("http://www.w3.org/1999/xhtml", "p", "p", __attrs__);
__attrs__.clear();
__attrs__.addAttribute("", "href", "href", "CDATA", "http://about.validator.nu/");
contentHandler.startElement("http://www.w3.org/1999/xhtml", "a", "a", __attrs__);
contentHandler.characters(__chars__, 0, 18);
contentHandler.endElement("http://www.w3.org/1999/xhtml", "a", "a");
contentHandler.endElement("http://www.w3.org/1999/xhtml", "p", "p");
contentHandler.endElement("http://www.w3.org/1999/xhtml", "body", "body");
contentHandler.endElement("http://www.w3.org/1999/xhtml", "html", "html");
contentHandler.endPrefixMapping("");
} finally {
contentHandler.endDocument();
}
}
private static final char[] __chars__ = { 'A', 'b', 'o', 'u', 't', ' ', 't', 'h', 'i', 's', ' ', 's', 'e', 'r', 'v', 'i', 'c', 'e' };
}
