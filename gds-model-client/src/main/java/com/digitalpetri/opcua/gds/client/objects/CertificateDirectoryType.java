package com.digitalpetri.opcua.gds.client.objects;

import java.util.concurrent.CompletableFuture;
import org.eclipse.milo.opcua.sdk.client.model.objects.CertificateGroupFolderType;
import org.eclipse.milo.opcua.stack.core.UaException;

/**
 * @see <a
 *     href="https://reference.opcfoundation.org/GDS/docs/7.9.2">https://reference.opcfoundation.org/GDS/docs/7.9.2</a>
 */
public interface CertificateDirectoryType extends DirectoryType {
  /**
   * Get the CertificateGroups {@link CertificateGroupFolderType} Node, or {@code null} if it does
   * not exist.
   *
   * <p>The Node is created when first accessed and cached for subsequent calls.
   *
   * @return the CertificateGroups {@link CertificateGroupFolderType} Node, or {@code null} if it
   *     does not exist.
   * @throws UaException if an error occurs creating or getting the Node.
   */
  CertificateGroupFolderType getCertificateGroupsNode() throws UaException;

  /**
   * Asynchronous implementation of {@link #getCertificateGroupsNode()}.
   *
   * @return a CompletableFuture that completes successfully with the CertificateGroupFolderType
   *     Node or completes exceptionally if an error occurs creating or getting the Node.
   */
  CompletableFuture<? extends CertificateGroupFolderType> getCertificateGroupsNodeAsync();
}
