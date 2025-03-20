package com.digitalpetri.opcua.gds.client;

import com.digitalpetri.opcua.gds.client.objects.AccessTokenIssuedAuditEventTypeNode;
import com.digitalpetri.opcua.gds.client.objects.ApplicationRegistrationChangedAuditEventTypeNode;
import com.digitalpetri.opcua.gds.client.objects.AuthorizationServiceTypeNode;
import com.digitalpetri.opcua.gds.client.objects.AuthorizationServicesFolderTypeNode;
import com.digitalpetri.opcua.gds.client.objects.CertificateDeliveredAuditEventTypeNode;
import com.digitalpetri.opcua.gds.client.objects.CertificateDirectoryTypeNode;
import com.digitalpetri.opcua.gds.client.objects.CertificateRequestedAuditEventTypeNode;
import com.digitalpetri.opcua.gds.client.objects.DirectoryTypeNode;
import com.digitalpetri.opcua.gds.client.objects.KeyCredentialDeliveredAuditEventTypeNode;
import com.digitalpetri.opcua.gds.client.objects.KeyCredentialManagementFolderTypeNode;
import com.digitalpetri.opcua.gds.client.objects.KeyCredentialRequestedAuditEventTypeNode;
import com.digitalpetri.opcua.gds.client.objects.KeyCredentialRevokedAuditEventTypeNode;
import com.digitalpetri.opcua.gds.client.objects.KeyCredentialServiceTypeNode;
import org.eclipse.milo.opcua.sdk.client.ObjectTypeManager;
import org.eclipse.milo.opcua.stack.core.NamespaceTable;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;

public class ObjectTypeInitializer {
  public static void initialize(
      NamespaceTable namespaceTable, ObjectTypeManager objectTypeManager) {
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=13").reindex(namespaceTable, "http://opcfoundation.org/UA/GDS/"),
        DirectoryTypeNode.class,
        DirectoryTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=63").reindex(namespaceTable, "http://opcfoundation.org/UA/GDS/"),
        CertificateDirectoryTypeNode.class,
        CertificateDirectoryTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=55").reindex(namespaceTable, "http://opcfoundation.org/UA/GDS/"),
        KeyCredentialManagementFolderTypeNode.class,
        KeyCredentialManagementFolderTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=233").reindex(namespaceTable, "http://opcfoundation.org/UA/GDS/"),
        AuthorizationServicesFolderTypeNode.class,
        AuthorizationServicesFolderTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=1039").reindex(namespaceTable, "http://opcfoundation.org/UA/GDS/"),
        KeyCredentialRequestedAuditEventTypeNode.class,
        KeyCredentialRequestedAuditEventTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=1057").reindex(namespaceTable, "http://opcfoundation.org/UA/GDS/"),
        KeyCredentialDeliveredAuditEventTypeNode.class,
        KeyCredentialDeliveredAuditEventTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=1075").reindex(namespaceTable, "http://opcfoundation.org/UA/GDS/"),
        KeyCredentialRevokedAuditEventTypeNode.class,
        KeyCredentialRevokedAuditEventTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=26").reindex(namespaceTable, "http://opcfoundation.org/UA/GDS/"),
        ApplicationRegistrationChangedAuditEventTypeNode.class,
        ApplicationRegistrationChangedAuditEventTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=91").reindex(namespaceTable, "http://opcfoundation.org/UA/GDS/"),
        CertificateRequestedAuditEventTypeNode.class,
        CertificateRequestedAuditEventTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=109").reindex(namespaceTable, "http://opcfoundation.org/UA/GDS/"),
        CertificateDeliveredAuditEventTypeNode.class,
        CertificateDeliveredAuditEventTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=975").reindex(namespaceTable, "http://opcfoundation.org/UA/GDS/"),
        AccessTokenIssuedAuditEventTypeNode.class,
        AccessTokenIssuedAuditEventTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=1020").reindex(namespaceTable, "http://opcfoundation.org/UA/GDS/"),
        KeyCredentialServiceTypeNode.class,
        KeyCredentialServiceTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=966").reindex(namespaceTable, "http://opcfoundation.org/UA/GDS/"),
        AuthorizationServiceTypeNode.class,
        AuthorizationServiceTypeNode::new);
  }
}
