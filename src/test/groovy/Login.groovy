import geb.Page

/**
 * Created by stevemckinney on 01/04/2017.
 */
class Login extends Page {
    static url = "login.php"

    static at = {
        $("h3").text() == "Login page"
    }
}
