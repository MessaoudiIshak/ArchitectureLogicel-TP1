package ws;

import javax.jws.WebService;

@WebService(endpointInterface = "ws.ConversionService")
public class ConversionServiceImplementation implements ConversionService {
    private static final double CONVERSION_RATE = 0.9 + (Math.random() * (1.1 - 0.9));

    @Override
    public double getConversionRate() {
        return CONVERSION_RATE;
    }

    @Override
    public double euroToDollar(double euro) {
        return euro * CONVERSION_RATE;
    }
}