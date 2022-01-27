package ya.baytsan;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;


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
  $("#firstName").setValue("aaa");
  $("#lastName").setValue("bbb");
  $("#userEmail").setValue("aaa@hhg.od");
  // кликаем на  женский пол
  $("#genterWrapper [for=gender-radio-2]").click();
  //вводим десятизначный номер мобильного телефона
  $("#userNumber").setValue("7777777777");
  //кликаем по полю даты, в появившемся окошке кликаем по  полю месяца, где в открывшемся списке
  // кликаем на название месяца
  $("#dateOfBirthInput").click();
  $(".react-datepicker__month-select").click();
  $(byText("April"));
  $(".react-datepicker__year-select").click();
  $(byText("1990"));
  $(".react-datepicker__month .react-datepicker__day--017").click();
  $("#subjectsContainer").setValue("geograthy").pressEnter();
  $("#hobbiesWrapper label .custom-control-label").click();
  //кликаем в окошко года и в появившемся списке кликаем на название месяца

  //кликаем на дату
  // в поле предмета вводим название последнего
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















