
package service;

public interface ITransaccion <T> {
    
    // definir la firma
     void Registrar(T o) throws Exception;
}
