package software.crldev.elrondspringbootstarterreactive.interactor.account;

import software.crldev.elrondspringbootstarterreactive.api.model.*;
import software.crldev.elrondspringbootstarterreactive.domain.account.Address;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;

/**
 * Interface used for interaction with Account on the network
 *
 * @author carlo_stanciu
 */
public interface ErdAccountInteractor {

    /**
     * Method used to query an Account's information
     *
     * @param address - Address input
     * @return - AccountOnNetwork API response
     */
    Mono<AccountOnNetwork> getAccountInfo(Address address);

    /**
     * Method used to query the balance of an Account
     *
     * @param address - Address input
     * @return - AddressBalance API response
     */
    Mono<AddressBalance> getBalance(Address address);

    /**
     * Method used to query the nonce of an Account
     *
     * @param address - Address input
     * @return - AddressNonce API response
     */
    Mono<AddressNonce> getNonce(Address address);

    /**
     * Method used to query the list of transactions for an Account
     *
     * @param address - Address input
     * @return - TransactionForAddress API response
     */
    Mono<List<TransactionForAddress>> getTransactions(Address address);

    /**
     * Method used to query a storage value of an Account
     *
     * @param address - Address input
     * @param key - String key of the value
     * @return - AddressStorageValue API Response
     */
    Mono<AddressStorageValue> getStorageValue(Address address, String key);

    /**
     * Method used to query all the storage of an Account
     *
     * @param address - Address input
     * @return - storage as a Map of String keys and String values
     */
    Mono<Map<String, String>> getStorage(Address address);


}
