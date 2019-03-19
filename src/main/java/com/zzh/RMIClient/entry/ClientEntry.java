package com.zzh.RMIClient.entry;

import com.zzh.RMIServer.stub.IUserManager;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClientEntry {

	 public static void main(String []args) throws RemoteException, NotBoundException{
		 
	 
	  Registry registry = LocateRegistry.getRegistry("127.0.0.1",2019);
      //返回注册表中绑定到指定 name 的远程引用，返回Remote
      IUserManager userManager = (IUserManager)registry.lookup("userManager");
      System.out.println("用户名是"+userManager.getAdminAccount().getUserName()
              +"密码"+userManager.getAdminAccount().getPassword());
	}
}
