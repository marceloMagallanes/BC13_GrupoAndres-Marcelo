package aut.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static framework.engine.utils.Constants.BASE_URL_AUT;

public class RumboHomePage extends SeleniumWrapper {

    private WebDriver driver;

    public RumboHomePage(WebDriver driver) {
        super(driver);
    }

    By locatorIda = By.xpath("//div[@class='d-1nwmwhy']");
    By locatorIdayVuelta = By.xpath("//div[@class='d-4mhg59']");
    By locatorMultidestino = By.xpath("//a[contains(text(),'Multidestino')]");

    By locatorIrAVuelo = By.xpath("//button[@aria-label='Buscar']");


    //By locatorIrAHotel = By.xpath("//button[@aria-label='Hoteles']");
    By locatorIrAHotel = By.xpath("//ul/li/div/a[@title='Hoteles']");

    By locatorOrigen = By.xpath("//input[@aria-label='Origen']");/*//input[@id=':Riqid6lalallbla2mm:']");*/

    By locatorDestino = By.xpath("//input[@aria-label='Destino']");

    By locatorSeleccionPasajero = By.xpath("//button[@class='d-1k0nsg5']");

    //By locatorSeleccionClase = By.xpath("//body/div/div[@class='e19fnmvl0 d-hpvee9 e161saim2']/div[@class='hub-container mobile e161saim0 d-1pw96xe eg3h3jz0']/div[2]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]/div[1]//*[name()='svg']//*[name()='path' and contains(@d,'M2.5799 4.')]");

    By locatorTurista = By.xpath("//body/div[2]/div[3]/div[1]/section[1]/ul[1]/li[2]");
    By locatorNoCookies = By.xpath("//button[@class='iubenda-cs-reject-btn iubenda-cs-btn-primary']");
    By locatorCaptchaExiste = By.xpath("//h2[contains(text(),'Comprobando']");

    By btnCheckCaptcha = By.xpath("//input[@type=\"checkbox\"]");
    //acciones del sitio
    public void irASoloIda() {
        click(esperarPorElemento(locatorIda));
    }

    public void irIdayVuelta() {
        click(esperarPorElemento(locatorIdayVuelta));
    }

    public void irSeleccionPasajero() {
        click(esperarPorElemento(locatorSeleccionPasajero));
    }

    public void irMultidestino() {
        click(esperarPorElemento(locatorMultidestino));
    }

    public void irAVuelo() {
        click((esperarPorElemento(locatorIrAVuelo)));
    }

    public void irABusquedaHotel() {
        click((esperarPorElemento(locatorIrAHotel)));
    }

    //public void irSeleccionClase() {

    /*public void irSeleccionClase(){

        click(esperarPorElemento(locatorSeleccionClase));
    }*/


        public void elegirOrigen() {
            click(esperarPorElemento(locatorOrigen));
        };

        public void seleccionPasajero() {
            click(esperarPorElemento(locatorSeleccionPasajero));
        };

  /*  public void irSeleccionClase(){

        WebElement element = driver.findElement(By.tagName("form"));
        WebElement sourchElement = element.findElement(By.xpath("//spa"))
    }*/


        public void irClaseTurista () {
            click(esperarPorElemento(locatorTurista));
        }

        public void noCookies () {
            if(isDisplayed(locatorNoCookies)) {
                click(esperarPorElemento(locatorNoCookies));
            }
        }

        public void validarCaptcha () {
            esperarXSegundos(800);
            if (isDisplayed(locatorCaptchaExiste)) {
                esperarXSegundos(7000);
                if(isEnabled(btnCheckCaptcha)){
                    click(esperarPorElemento(btnCheckCaptcha));
                }
            }

        }

        public void navegarAlSitio () {
            navigateTo(BASE_URL_AUT);
        }



        public void preferencias (String origen, String destino/*,String diaIda,
                                            String mesIda,String diaVuelta,String mesVuelta*/){

        /*if(isDisplayed(locatorNoCookies)){
            click(esperarPorElemento(locatorNoCookies));
        }*/
            esperarXSegundos(200);
            agregarTexto(esperarPorElemento(locatorOrigen), origen);
            esperarXSegundos(300);
            agregarTexto(esperarPorElemento(locatorDestino), destino);
            esperarXSegundos(300);

        /*agregarTexto(esperarPorElemento(locatorUsername),username);
        esperarXSegundos(500);

        agregarTexto(esperarPorElemento(locatorDia),dia);
        esperarXSegundos(500);

        seleccionarComboBoxPortextoVisible(locatorMes,mes);
        esperarXSegundos(500);

        agregarTexto(esperarPorElemento(locatorAnnio),annio);
        esperarXSegundos(500);

        click(buscarElementosWeb(locatorGeneros).get(genero));
        esperarXSegundos(500);

        click(buscarElementosWeb(locatorPreferencias).get(0));
        esperarXSegundos(500);

        click(buscarElementosWeb(locatorPreferencias).get(1));
        esperarXSegundos(500);

        click(esperarPorElemento(btnRegistrate));
        scrollingDownElement(esperarPorElemento(locatorCorreo));
        esperarXSegundos(1500);*/

        }

    }

