/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
class Cuenta {
    protected String mNumero;
    protected String mTitular;
    protected double mSaldo;
    
    public Cuenta(String numero, String titular){
        mNumero=numero;
        mTitular=titular;
        mSaldo=0.0;
    }
    
    public double getSaldo(){
        return mSaldo;
    }
    
    public void ingresar(double x){
        
        mSaldo=mSaldo+x;
    }
    
    public void retirar(double x){
        
        mSaldo=mSaldo-x;
    }
}
