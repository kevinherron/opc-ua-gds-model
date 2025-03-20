package com.digitalpetri.opcua.gds.client.objects;

import java.util.concurrent.CompletableFuture;
import org.eclipse.milo.opcua.sdk.client.model.objects.BaseObjectType;
import org.eclipse.milo.opcua.sdk.client.model.variables.PropertyType;
import org.eclipse.milo.opcua.sdk.core.QualifiedProperty;
import org.eclipse.milo.opcua.stack.core.UaException;
import org.eclipse.milo.opcua.stack.core.types.builtin.ByteString;
import org.eclipse.milo.opcua.stack.core.types.builtin.ExpandedNodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.StatusCode;
import org.eclipse.milo.opcua.stack.core.types.structured.UserTokenPolicy;

/**
 * @see <a href="https://reference.opcfoundation.org/GDS/docs/9.6.4">https://reference.opcfoundation.org/GDS/docs/9.6.4</a>
 */
public interface AuthorizationServiceType extends BaseObjectType {
  QualifiedProperty<String> SERVICE_URI = new QualifiedProperty<>(
      "http://opcfoundation.org/UA/GDS/",
      "ServiceUri",
      ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/;i=12"),
      -1,
      String.class
  );

  QualifiedProperty<ByteString> SERVICE_CERTIFICATE = new QualifiedProperty<>(
      "http://opcfoundation.org/UA/GDS/",
      "ServiceCertificate",
      ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/;i=15"),
      -1,
      ByteString.class
  );

  QualifiedProperty<UserTokenPolicy[]> USER_TOKEN_POLICIES = new QualifiedProperty<>(
      "http://opcfoundation.org/UA/GDS/",
      "UserTokenPolicies",
      ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/;i=304"),
      1,
      UserTokenPolicy[].class
  );

  /**
   * Get the local value of the ServiceUri Node.
   * <p>
   * The returned value is the last seen; it is not read live from the server.
   *
   * @return the local value of the ServiceUri Node.
   * @throws UaException if an error occurs creating or getting the ServiceUri Node.
   */
  String getServiceUri() throws UaException;

  /**
   * Set the local value of the ServiceUri Node.
   * <p>
   * The value is only updated locally; it is not written to the server.
   *
   * @param value the local value to set for the ServiceUri Node.
   * @throws UaException if an error occurs creating or getting the ServiceUri Node.
   */
  void setServiceUri(String value) throws UaException;

  /**
   * Read the value of the ServiceUri Node from the server and update the local value if
   * the operation succeeds.
   *
   * @return the {@link String} value read from the server.
   * @throws UaException if a service- or operation-level error occurs.
   */
  String readServiceUri() throws UaException;

  /**
   * Write a new value for the ServiceUri Node to the server and update the local value if
   * the operation succeeds.
   *
   * @param value the {@link String} value to write to the server.
   * @throws UaException if a service- or operation-level error occurs.
   */
  void writeServiceUri(String value) throws UaException;

  /**
   * An asynchronous implementation of {@link #readServiceUri}.
   *
   * @return a CompletableFuture that completes successfully with the value or completes
   * exceptionally if an operation- or service-level error occurs.
   */
  CompletableFuture<? extends String> readServiceUriAsync();

  /**
   * An asynchronous implementation of {@link #writeServiceUri}.
   *
   * @return a CompletableFuture that completes successfully with the operation result or
   * completes exceptionally if a service-level error occurs.
   */
  CompletableFuture<StatusCode> writeServiceUriAsync(String value);

  /**
   * Get the ServiceUri {@link PropertyType} Node, or {@code null} if it does not exist.
   * <p>
   * The Node is created when first accessed and cached for subsequent calls.
   *
   * @return the ServiceUri {@link PropertyType} Node, or {@code null} if it does not exist.
   * @throws UaException if an error occurs creating or getting the Node.
   */
  PropertyType getServiceUriNode() throws UaException;

  /**
   * Asynchronous implementation of {@link #getServiceUriNode()}.
   *
   * @return a CompletableFuture that completes successfully with the
   * PropertyType Node or completes exceptionally if an error occurs creating or
   * getting the Node.
   */
  CompletableFuture<? extends PropertyType> getServiceUriNodeAsync();

  /**
   * Get the local value of the ServiceCertificate Node.
   * <p>
   * The returned value is the last seen; it is not read live from the server.
   *
   * @return the local value of the ServiceCertificate Node.
   * @throws UaException if an error occurs creating or getting the ServiceCertificate Node.
   */
  ByteString getServiceCertificate() throws UaException;

  /**
   * Set the local value of the ServiceCertificate Node.
   * <p>
   * The value is only updated locally; it is not written to the server.
   *
   * @param value the local value to set for the ServiceCertificate Node.
   * @throws UaException if an error occurs creating or getting the ServiceCertificate Node.
   */
  void setServiceCertificate(ByteString value) throws UaException;

  /**
   * Read the value of the ServiceCertificate Node from the server and update the local value if
   * the operation succeeds.
   *
   * @return the {@link ByteString} value read from the server.
   * @throws UaException if a service- or operation-level error occurs.
   */
  ByteString readServiceCertificate() throws UaException;

  /**
   * Write a new value for the ServiceCertificate Node to the server and update the local value if
   * the operation succeeds.
   *
   * @param value the {@link ByteString} value to write to the server.
   * @throws UaException if a service- or operation-level error occurs.
   */
  void writeServiceCertificate(ByteString value) throws UaException;

  /**
   * An asynchronous implementation of {@link #readServiceCertificate}.
   *
   * @return a CompletableFuture that completes successfully with the value or completes
   * exceptionally if an operation- or service-level error occurs.
   */
  CompletableFuture<? extends ByteString> readServiceCertificateAsync();

  /**
   * An asynchronous implementation of {@link #writeServiceCertificate}.
   *
   * @return a CompletableFuture that completes successfully with the operation result or
   * completes exceptionally if a service-level error occurs.
   */
  CompletableFuture<StatusCode> writeServiceCertificateAsync(ByteString value);

  /**
   * Get the ServiceCertificate {@link PropertyType} Node, or {@code null} if it does not exist.
   * <p>
   * The Node is created when first accessed and cached for subsequent calls.
   *
   * @return the ServiceCertificate {@link PropertyType} Node, or {@code null} if it does not exist.
   * @throws UaException if an error occurs creating or getting the Node.
   */
  PropertyType getServiceCertificateNode() throws UaException;

  /**
   * Asynchronous implementation of {@link #getServiceCertificateNode()}.
   *
   * @return a CompletableFuture that completes successfully with the
   * PropertyType Node or completes exceptionally if an error occurs creating or
   * getting the Node.
   */
  CompletableFuture<? extends PropertyType> getServiceCertificateNodeAsync();

  /**
   * Get the local value of the UserTokenPolicies Node.
   * <p>
   * The returned value is the last seen; it is not read live from the server.
   *
   * @return the local value of the UserTokenPolicies Node.
   * @throws UaException if an error occurs creating or getting the UserTokenPolicies Node.
   */
  UserTokenPolicy[] getUserTokenPolicies() throws UaException;

  /**
   * Set the local value of the UserTokenPolicies Node.
   * <p>
   * The value is only updated locally; it is not written to the server.
   *
   * @param value the local value to set for the UserTokenPolicies Node.
   * @throws UaException if an error occurs creating or getting the UserTokenPolicies Node.
   */
  void setUserTokenPolicies(UserTokenPolicy[] value) throws UaException;

  /**
   * Read the value of the UserTokenPolicies Node from the server and update the local value if
   * the operation succeeds.
   *
   * @return the {@link UserTokenPolicy[]} value read from the server.
   * @throws UaException if a service- or operation-level error occurs.
   */
  UserTokenPolicy[] readUserTokenPolicies() throws UaException;

  /**
   * Write a new value for the UserTokenPolicies Node to the server and update the local value if
   * the operation succeeds.
   *
   * @param value the {@link UserTokenPolicy[]} value to write to the server.
   * @throws UaException if a service- or operation-level error occurs.
   */
  void writeUserTokenPolicies(UserTokenPolicy[] value) throws UaException;

  /**
   * An asynchronous implementation of {@link #readUserTokenPolicies}.
   *
   * @return a CompletableFuture that completes successfully with the value or completes
   * exceptionally if an operation- or service-level error occurs.
   */
  CompletableFuture<? extends UserTokenPolicy[]> readUserTokenPoliciesAsync();

  /**
   * An asynchronous implementation of {@link #writeUserTokenPolicies}.
   *
   * @return a CompletableFuture that completes successfully with the operation result or
   * completes exceptionally if a service-level error occurs.
   */
  CompletableFuture<StatusCode> writeUserTokenPoliciesAsync(UserTokenPolicy[] value);

  /**
   * Get the UserTokenPolicies {@link PropertyType} Node, or {@code null} if it does not exist.
   * <p>
   * The Node is created when first accessed and cached for subsequent calls.
   *
   * @return the UserTokenPolicies {@link PropertyType} Node, or {@code null} if it does not exist.
   * @throws UaException if an error occurs creating or getting the Node.
   */
  PropertyType getUserTokenPoliciesNode() throws UaException;

  /**
   * Asynchronous implementation of {@link #getUserTokenPoliciesNode()}.
   *
   * @return a CompletableFuture that completes successfully with the
   * PropertyType Node or completes exceptionally if an error occurs creating or
   * getting the Node.
   */
  CompletableFuture<? extends PropertyType> getUserTokenPoliciesNodeAsync();
}
