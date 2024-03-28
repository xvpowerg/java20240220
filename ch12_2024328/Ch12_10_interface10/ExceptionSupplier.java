/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_2024328.Ch12_10_interface10;
import java.util.function.Supplier;
/**
 *
 * @author xvpow
 */
public class ExceptionSupplier implements Supplier<Exception>{
    public Exception  get(){
        return new IllegalArgumentException("錯誤的數值");
    }
}
