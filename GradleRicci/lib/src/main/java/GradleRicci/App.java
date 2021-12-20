package GradleRicci;

import GradleRicci.App;

public class App{

public String getGretting(){
return "Olá GradleRicci Mundo!!";
}

public static void main(String[] args){
System.out.println(new App().getGretting());
}

}