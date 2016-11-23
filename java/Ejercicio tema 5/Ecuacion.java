public class Ecuacion{
    public static void main(String[] args){
        //Código que resuelva la siguiente ecuacion:      //Formula para la solucion de las variables:      // Formula de las ecuaciones
        /*
            x+y=1   |                                       x= (e*d-b*f)/(a*d-b*c)  |                        a*x+b*y=e   |
            2x+2y=2 |                                       y= (a*f-e*c)/(a*d-b*c)   |                        c*x+d*y=f   |

            2x+y=7   |
            -x+2y=-1 |
        */
       
        //Definimos el valor de las variables.
        double x = (1*2-1*2)/(1*2-1*2);
        double y = (1*2-1*2)/(1*2-1*2);

        //Creamos un objeto que va a ser el que vamos a usar en el futuro y las llamadas a los metodos.
        Ecuaciones n1 = new Ecuaciones();
        Ecuaciones valorDex = new Ecuaciones();
        Ecuaciones valorDey = new Ecuaciones();
        Ecuaciones solucion = new Ecuaciones();


        //Estructura de control if que muestre la solución si la ecuacion es resoluble o
        //que muestre que no se ha podido resolver si no es resoluble.
       /*======================================== 
       if(solucion.solucionEcuacion==true){
            System.out.println(valorDex.valorX);
            System.out.println(valorDey.valorY);
        }else{
            System.out.println("La ecuacion no se ha podido resolver");
        }
        */
        
        
    }
    
    //Creamos otra clase que nos devolverán los valores de x de y y también si la ecuación se puede resolver o no con un boolean.
    public static class Ecuaciones{
        //Formula para solucionar una ecuacion:
        /*
            a*x+b*y=e   |
            c*x+d*y=f   |

        */
        //Definimos las posibles variables de la ecuación:
       /* private double x;
        private double y;
        private double solucionBoolean; */

        //Creamos un método boolean que devuelva true or false si la encuacion se puede resolver o no
        public boolean solucionEcuacion(boolean solucion){
            if(1*2-1*1 != 0)
                solucion = true;
            else
                solucion = false;

            return solucion;
        }

        //Creamos un segundo método que devuelva el valor de x.
        public double valorX(double valorDex){
            valorDex = (1*2-1*2)/(1*2-1*2);
            return valorDex;
        }

        //Creamos un tercer método que devuelva el valor de y.
        public double valorY(double valorDey){
            valorDey = (1*2-1*2)/(1*2-1*2);
            return valorDey;
        }
    }
}