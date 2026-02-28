package com.bytehonor.sdk.toolkit.network.exception;

/**
 * @author lijianqiang
 *
 */
public class NetworkToolkitException extends RuntimeException {

    private static final long serialVersionUID = 8241747723232910227L;

    public NetworkToolkitException() {
        super();
    }

    public NetworkToolkitException(String message) {
        super(message);
    }

    public NetworkToolkitException(Exception cause) {
        super(cause);
    }
}
