package org.thoughtcrime.securesms.transport;

public class InsecureFallbackApprovalException extends Exception {
  public InsecureFallbackApprovalException(String detailMessage) {
    super(detailMessage);
  }
  public InsecureFallbackApprovalException(Exception e) {
    super(e);
  }
}
