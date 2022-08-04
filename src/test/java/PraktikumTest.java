import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.yandex.praktik.Account;
import static org.junit.Assert.*;


public class PraktikumTest {

    @Test
    @DisplayName("Check account min length success")
    public void checkMinLengthSuccess() {
        Account account = new Account("Т ША");
        assertTrue(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Check account min length failed")
    public void checkMinLengthFailed() {
        Account account = new Account("Т Ш");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Check account max length success")
    public void checkMaxLengthSuccess() {
        Account account = new Account("Тахтамышь Богатырев");
        assertTrue(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Check account max length failed")
    public void checkMaxLengthFailed() {
        Account account = new Account("Тахтамышь Богатырева");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Check account space in name success")
    public void checkSpaceInNameSucces() {
        Account accountWithSpace = new Account("Тимотей Шевроле");
        assertTrue(accountWithSpace.checkNameToEmboss());
    }

    @Test
    @DisplayName("Check account space in name without central space")
    public void checkSpaceInNameWithoutCentralSpace() {
        Account accountWithSpace = new Account("ТимотейШевроле");
        assertFalse(accountWithSpace.checkNameToEmboss());
    }

    @Test
    @DisplayName("Check account space in name with space at the end")
    public void checkSpaceInNameWithSpaceAtTheEnd() {
        Account accountWithSpace = new Account("Тимотей Шевроле ");
        assertFalse(accountWithSpace.checkNameToEmboss());
    }

    @Test
    @DisplayName("Check account space in name with space at the beginning")
    public void checkSpaceInNameWithSpaceAtBeginning() {
        Account accountWithSpace = new Account(" Тимотей Шевроле");
        assertFalse(accountWithSpace.checkNameToEmboss());
    }

    @Test
    @DisplayName("Check account space in name with space at the beginning and at the end")
    public void checkSpaceInNameWithSpaceAtBeginningAndAtTheEnd() {
        Account accountWithSpace = new Account(" Тимотей Шевроле ");
        assertFalse(accountWithSpace.checkNameToEmboss());
    }
}
