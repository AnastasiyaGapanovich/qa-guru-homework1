package ya.baytsan;


import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
//import static com.sun.xml.internal.ws.policy.sourcemodel.wspolicy.XmlToken.Name;


// static com.codeborne.selenide.Condition.text;
// import static com.codeborne.selenide.Selectors.byText;
//import static com.codeborne.selenide.Selenide.$;
//import static com.codeborne.selenide.Selenide.open;



public class StudentsRegistrationForm {

 @Test
 void demoTest() {
  // открываем форму
  open("https://demoqa.com/automation-practice-form");
  // вводим имя и электронную почту
  $("#firstName").setValue("Ivan");
  $("#lastName").setValue("bbb");
  $("#userEmail").setValue("aaa@ya.ru");
  // кликаем на  женский пол
  $("#genterWrapper [for=gender-radio-2]").click();
  //вводим десятизначный номер мобильного телефона
  $("#userNumber").setValue("9999999999");
  //кликаем по полю даты, в появившемся окошке кликаем по  полю месяца, где в открывшемся списке
  // кликаем на название месяца
  $("#dateOfBirthInput").click();
  $(".react-datepicker__month-select").click();
  $(byText("April")).click();
  //кликаем в окошко года и в появившемся списке кликаем на конкретный год
  $(".react-datepicker__year-select").click();
  $(byText("1990")).click();
  //кликаем на дату
  $(".react-datepicker__month .react-datepicker__day--017").click();
  // в поле предмета вводим название последнего
  //$("#subjectsContainer").setValue("geograthy").pressEnter();
  //кликаем на надпись "Sport" во вкладке Hobbies
  $("#hobbiesWrapper").$(byText("Sports")).click();
  //загружаем файл
  //вводим адрес в соответствующем поле
  $("#currentAddress").setValue("aaa");
  //выбираем штат:кликаем в окошко "Select State" и кликаем на "NCR"
  $("#stateCity-wrapper").scrollTo();
  $("#state").click();
         //$(".css-2613qy-menu").shouldBe(Condition.visible).click();
  $(byText("NCR")).click();
//выбираем штат:кликаем в окошко "Select City" и кликаем на "Noida"
  //кликаем Submit
  $("#submit").click();
  //проверка заполнения формы
  $("div.modal-body").$(byText("Student Name")).sibling(0).shouldHave(Condition.text("Ivan"));
 // $(".modal-body").$(byText("Student Email")).sibling(0).shouldHave(Condition.text("aaa@ya.ru"));
  $(".modal-body").$(byText("Gender")).sibling(0).shouldHave(Condition.text("Female"));
  $(".modal-body").$(byText("Mobile")).sibling(0).shouldHave(Condition.text("9999999999"));
  $(".modal-body").$(byText("Date of Birth")).sibling(0).shouldHave(Condition.text("17 April,1990"));
  $(".modal-body").$(byText("Student Email")).sibling(0).shouldHave(Condition.text("aaa@ya.ru"));

  sleep(5000);
 }
}











 // $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
 // $("#firstName").setValue("Alex");
//  $("#lastName").setValue("Egorov");
 // $("#userEmail").setValue("alex@egorov.com");

  //$("#genterWrapper").$(byText("Male")).click();
//  $("#userNumber").setValue("1263777443");
 // $("#dateOfBirthInput").click();
 // $(".react-datepicker__month-select").selectOption("July");
 // $(".react-datepicker__year-select").selectOption("2005");
 // $(".react-datepicker__day--030:not(.react-datepicker__day--outside-month)").click();
 // //react-datepicker__day react-datepicker__day--030 react-datepicker__day--selected react-datepicker__day--outside-month
  //react-datepicker__day react-datepicker__day--030 react-datepicker__day--weekend


 // $("#subjectsInput").setValue("maths").pressEnter();
//  $("#hobbiesWrapper").$(byText("Sports")).click();
 // $("#uploadPicture").uploadFromClasspath("img/1.png");
 // $("#currentAddress").setValue("gdhj").pressEnter().scrollTo();
  //$("#state").click();
  //$("#stateCity-wrapper").$(byText("NCR")).click();
 // $("#city").click();
 // $("#stateCity-wrapper").$(byText("Delhi")).click();
 // $("#submit").click();
 // $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
 // $(".table-responsive").shouldHave(text("alex@egorov.com"));
 // $(".table-responsive").$(byText("Student Name")).parent().shouldHave(text("Alex Egorov"));

 //}
 //}















