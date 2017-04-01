import geb.Page

/**
 * Created by stevemckinney on 01/04/2017.
 */
class MainPage extends Page {

    static  url = "index.html"

    static at = {
        $("#title").text() == "Demo page for selenium code"
    }
}
