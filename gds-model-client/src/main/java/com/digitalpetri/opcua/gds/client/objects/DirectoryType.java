package com.digitalpetri.opcua.gds.client.objects;

import java.util.concurrent.CompletableFuture;
import org.eclipse.milo.opcua.sdk.client.model.objects.FolderType;
import org.eclipse.milo.opcua.stack.core.UaException;

/**
 * @see <a
 *     href="https://reference.opcfoundation.org/GDS/docs/6.6.3">https://reference.opcfoundation.org/GDS/docs/6.6.3</a>
 */
public interface DirectoryType extends FolderType {
  /**
   * Get the Applications {@link FolderType} Node, or {@code null} if it does not exist.
   *
   * <p>The Node is created when first accessed and cached for subsequent calls.
   *
   * @return the Applications {@link FolderType} Node, or {@code null} if it does not exist.
   * @throws UaException if an error occurs creating or getting the Node.
   */
  FolderType getApplicationsNode() throws UaException;

  /**
   * Asynchronous implementation of {@link #getApplicationsNode()}.
   *
   * @return a CompletableFuture that completes successfully with the FolderType Node or completes
   *     exceptionally if an error occurs creating or getting the Node.
   */
  CompletableFuture<? extends FolderType> getApplicationsNodeAsync();
}
