/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uttt.generic;

import mx.edu.uttt.view.frmLogin;

/**
 *
 * @author Gabriel
 */
public class SingletonLogin {
    
    public SingletonLogin(){
        
    }
    public static frmLogin getInstance(){
        return ObjectLoginInstance.INSTANCE_LOGIN;
    }
    
    private static class ObjectLoginInstance{
        private static final frmLogin INSTANCE_LOGIN=new frmLogin();
    }
}
