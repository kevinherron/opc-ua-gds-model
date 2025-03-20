package com.digitalpetri.opcua.gds.server.objects;

import org.eclipse.milo.opcua.sdk.core.QualifiedProperty;
import org.eclipse.milo.opcua.sdk.server.model.objects.AuditUpdateMethodEventType;
import org.eclipse.milo.opcua.sdk.server.model.variables.PropertyType;
import org.eclipse.milo.opcua.stack.core.types.builtin.ExpandedNodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;

/**
 * @see <a
 *     href="https://reference.opcfoundation.org/GDS/docs/7.9.13">https://reference.opcfoundation.org/GDS/docs/7.9.13</a>
 */
public interface CertificateDeliveredAuditEventType extends AuditUpdateMethodEventType {
  QualifiedProperty<NodeId> CERTIFICATE_GROUP =
      new QualifiedProperty<>(
          "http://opcfoundation.org/UA/GDS/",
          "CertificateGroup",
          ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/;i=17"),
          -1,
          NodeId.class);

  QualifiedProperty<NodeId> CERTIFICATE_TYPE =
      new QualifiedProperty<>(
          "http://opcfoundation.org/UA/GDS/",
          "CertificateType",
          ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/;i=17"),
          -1,
          NodeId.class);

  NodeId getCertificateGroup();

  void setCertificateGroup(NodeId value);

  PropertyType getCertificateGroupNode();

  NodeId getCertificateType();

  void setCertificateType(NodeId value);

  PropertyType getCertificateTypeNode();
}
