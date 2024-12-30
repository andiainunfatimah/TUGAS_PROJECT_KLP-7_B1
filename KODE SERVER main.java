/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GajiServer;

/**
 *
 * @author ASUS
 */
import GajiServer.Services;
import java.rmi.AlreadyBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        try {
            // Membuat instance layanan
            Services serv = new Services();

            // Membuat registry pada port 2000
            Registry register = LocateRegistry.createRegistry(2000);

            // Mendaftarkan layanan ke registry
            register.rebind("services", serv); // Gunakan `rebind` untuk menggantikan jika sudah ada
            System.out.println("Server is connected and ready for operation");
        } catch (RemoteException e) {
            System.err.println("Server error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
