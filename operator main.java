/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package GajiServer;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface OprationRMI extends Remote {
    double hitungGaji( double gajiPokok,boolean tunjanganTetap,boolean makanHarian,boolean transportasi,double bonusKinerja,
    double bonusTahunan,boolean potonganPajak,boolean potonganBPJS,double pinjaman,double dendaKeterlambatan) throws RemoteException;
    
}
