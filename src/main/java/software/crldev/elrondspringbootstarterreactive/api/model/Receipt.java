package software.crldev.elrondspringbootstarterreactive.api.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

import java.math.BigInteger;

/**
 * part of API response used in transactions and simulation results
 *
 * @author carlo_stanciu
 */
@Value
@Jacksonized
@Builder
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Receipt {

    @JsonProperty("hash")
    String hash;
    @JsonProperty("nonce")
    Long nonce;
    @JsonProperty("value")
    BigInteger value;
    @JsonProperty("receiver")
    String receiver;
    @JsonProperty("sender")
    String sender;

}