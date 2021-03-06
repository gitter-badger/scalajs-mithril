package co.technius.scalajs.mithril.tagsext

import co.technius.scalajs.mithril.VNode
import scalatags.generic

/*
 * Adapted from Scalatags by Li Haoyi, which is licensed under MIT License.
 */
trait Tags extends generic.Tags[VNode, VNode, VNode] with TagFactory {
  // Root Element
  lazy val html = tag("html")
  // Document Metadata
  lazy val head = tag("head")
  lazy val base = tag("base", void = true)
  lazy val link = tag("link", void = true)
  lazy val meta = tag("meta", void = true)
  //Scripting
  lazy val script = tag("script")
  // Sections
  lazy val body = tag("body")
  lazy val h1 = tag("h1")
  lazy val h2 = tag("h2")
  lazy val h3 = tag("h3")
  lazy val h4 = tag("h4")
  lazy val h5 = tag("h5")
  lazy val h6 = tag("h6")
  lazy val header = tag("header")
  lazy val footer = tag("footer")
  // Grouping content
  lazy val p = tag("p")
  lazy val hr = tag("hr", void = true)
  lazy val pre = tag("pre")
  lazy val blockquote = tag("blockquote")
  lazy val ol = tag("ol")
  lazy val ul = tag("ul")
  lazy val li = tag("li")
  lazy val dl = tag("dl")
  lazy val dt = tag("dt")
  lazy val dd = tag("dd")
  lazy val figure = tag("figure")
  lazy val figcaption = tag("figcaption")
  lazy val div = tag("div")
  // Text-level semantics
  lazy val a = tag("a")
  lazy val em = tag("em")
  lazy val strong = tag("strong")
  lazy val small = tag("small")
  lazy val s = tag("s")
  lazy val cite = tag("cite")
  lazy val code = tag("code")
  lazy val sub = tag("sub")
  lazy val sup = tag("sup")
  lazy val i = tag("i")
  lazy val b = tag("b")
  lazy val u = tag("u")
  lazy val span = tag("span")
  lazy val br = tag("br", void = true)
  lazy val wbr = tag("wbr", void = true)
  // Edits
  lazy val ins = tag("ins")
  lazy val del = tag("del")
  // Embedded content
  lazy val img = tag("img", void = true)
  lazy val iframe = tag("iframe")
  lazy val embed = tag("embed", void = true)
  lazy val `object` = tag("object")
  lazy val param = tag("param", void = true)
  lazy val video = tag("video")
  lazy val audio = tag("audio")
  lazy val source = tag("source", void = true)
  lazy val track = tag("track", void = true)
  lazy val canvas = tag("canvas")
  lazy val map = tag("map")
  lazy val area = tag("area", void = true)
  // Tabular data
  lazy val table = tag("table")
  lazy val caption = tag("caption")
  lazy val colgroup = tag("colgroup")
  lazy val col = tag("col", void = true)
  lazy val tbody = tag("tbody")
  lazy val thead = tag("thead")
  lazy val tfoot = tag("tfoot")
  lazy val tr = tag("tr")
  lazy val td = tag("td")
  lazy val th = tag("th")
  // Forms
  lazy val form = tag("form")
  lazy val fieldset = tag("fieldset")
  lazy val legend = tag("legend")
  lazy val label = tag("label")
  lazy val input = tag("input", void = true)
  lazy val button = tag("button")
  lazy val select = tag("select")
  lazy val datalist = tag("datalist")
  lazy val optgroup = tag("optgroup")
  lazy val option = tag("option")
  lazy val textarea = tag("textarea")
}
