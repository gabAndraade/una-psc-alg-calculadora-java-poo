public class Calculos {
    public double adicao(double n1, double n2){
        return n1+n2;
    }
    public double subtracao(double n1, double n2){
        return n1-n2;
    }
    public double multiplicacao(double n1, double n2){
        return n1*n2;
    }
    public void divisao(double n1,double n2){
        if(n2 == 0){
            System.out.println("Impossível realizar uma divisão por zero");
        }else{
            System.out.println("O quociente da divisão é: "+n1/n2);
        }
        
    }
    public double potencia(double n1,double n2){
        if (n2 ==0) {
            System.out.println("Todo número elevado a zero será igual a 1");
            return 1;
        }else{
        return Math.pow(n1, n2);
        }
    }
    public double raiz(double n1){
        if (n1<0) {
            System.out.println("Não existe raiz de número negativo.");
        }
        return Math.sqrt(n1);
    }

    
}
