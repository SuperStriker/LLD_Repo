package DesignPattern.strategy2;

public class ZipCompressionStrategy implements CompressionStrategy{

    @Override
    public String compress(final String data) {
        System.out.println("Compressing using zip sdk");
        return data;
    }
    
}
