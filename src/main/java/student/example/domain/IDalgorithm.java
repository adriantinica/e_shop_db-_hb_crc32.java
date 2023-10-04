package student.example.domain;

import java.util.UUID;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import java.util.zip.CRC32;

public class IDalgorithm {

    public UUID id = UUID.randomUUID();
                                  
    
    public long generatedCode( UUID id){

        long mostSigBits = id.getMostSignificantBits();
        long leastSigBits = id.getLeastSignificantBits();
        byte[] uuidBytes = new byte[16];

        for (int i = 0; i < 8; i++) {
            uuidBytes[i] = (byte) (mostSigBits >>> 8 * (7 - i));
            uuidBytes[i + 8] = (byte) (leastSigBits >>> 8 * (7 - i));
        }

        // Calculate CRC32 checksum
        CRC32 crc = new CRC32();
        crc.update(uuidBytes);

        System.out.println("CRC32: "+ crc.getValue());


        return crc.getValue();
    }

    

}
