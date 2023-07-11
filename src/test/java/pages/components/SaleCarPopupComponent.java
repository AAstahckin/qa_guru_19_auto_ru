package pages.components;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class SaleCarPopupComponent {

    MarketingPopupComponents marketingPopupComponents = new MarketingPopupComponents();

    SelenideElement
            inputMarks = $(".TextInput__input .TextInput__box .TextInput__control"),
    offerInitialScreenCar = $(".OfferInitialScreenCarInfo__handMadeButton-DP9Gg");

    @Step("Убираем рекламное окно")
    public void shutdownMarketingPopup() {
        if (offerInitialScreenCar.isDisplayed()) {
            offerInitialScreenCar.hover().click();
        }
    }
}
