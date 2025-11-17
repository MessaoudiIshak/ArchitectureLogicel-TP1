package ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface ConversionService {
    @WebMethod
    double euroToDollar(double euro);
    
    @WebMethod
    double getConversionRate();
}
