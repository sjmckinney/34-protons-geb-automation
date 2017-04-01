/**
 * Created by stevemckinney on 01/04/2017.
 */

import geb.Browser

Browser.drive {

    /*
    Use 'go' to explicitly go to a fixed URL

        go "login.php"

    Alternately use the 'to' or 'via' methods to call
    a page object
    */

    to Login

    /*
    Instead of explicity asserting the existence
    of an expected element on the page

        assert $("h3").text() == "Login page"

    use the 'at' method to assert that on correct page
    */

    at Login

    $("form#login").with {
        username = "user"
        password = "123"
        $("input", name: "submit").click()
    }

    /*
    Previously this assertion that the Main Page had loaded
    was guarded by a waitFor method as there is a 5 second
    delay before the Login page redirects.

        waitFor { $("#title") }
        assert $("#title").text() == == "Demo page for selenium code"

    By setting the 'atCheckWaiting = true' property true in
    the GebConfig file the same effect can be achieved.
    The possible values for the atCheckWaiting property are
    consistent with the ones for wait option and can also
    be overridden on a per page class basis.
    */

    at MainPage

    /*
    The 'at' method points the Browsers.page
    property to the new page object as
    proven by the assert below
    */

    assert page instanceof MainPage
}
