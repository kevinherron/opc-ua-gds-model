package com.digitalpetri.opcua.gds.server.objects;

import java.util.Optional;
import org.eclipse.milo.opcua.sdk.core.nodes.VariableNode;
import org.eclipse.milo.opcua.sdk.server.model.objects.AuditUpdateMethodEventTypeNode;
import org.eclipse.milo.opcua.sdk.server.model.variables.PropertyTypeNode;
import org.eclipse.milo.opcua.sdk.server.nodes.UaNodeContext;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.QualifiedName;
import org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.UByte;
import org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.UInteger;
import org.eclipse.milo.opcua.stack.core.types.structured.AccessRestrictionType;
import org.eclipse.milo.opcua.stack.core.types.structured.RolePermissionType;

public class CertificateRequestedAuditEventTypeNode extends AuditUpdateMethodEventTypeNode
    implements CertificateRequestedAuditEventType {
  public CertificateRequestedAuditEventTypeNode(
      UaNodeContext context,
      NodeId nodeId,
      QualifiedName browseName,
      LocalizedText displayName,
      LocalizedText description,
      UInteger writeMask,
      UInteger userWriteMask,
      RolePermissionType[] rolePermissions,
      RolePermissionType[] userRolePermissions,
      AccessRestrictionType accessRestrictions,
      UByte eventNotifier) {
    super(
        context,
        nodeId,
        browseName,
        displayName,
        description,
        writeMask,
        userWriteMask,
        rolePermissions,
        userRolePermissions,
        accessRestrictions,
        eventNotifier);
  }

  public CertificateRequestedAuditEventTypeNode(
      UaNodeContext context,
      NodeId nodeId,
      QualifiedName browseName,
      LocalizedText displayName,
      LocalizedText description,
      UInteger writeMask,
      UInteger userWriteMask,
      RolePermissionType[] rolePermissions,
      RolePermissionType[] userRolePermissions,
      AccessRestrictionType accessRestrictions) {
    super(
        context,
        nodeId,
        browseName,
        displayName,
        description,
        writeMask,
        userWriteMask,
        rolePermissions,
        userRolePermissions,
        accessRestrictions);
  }

  @Override
  public PropertyTypeNode getCertificateGroupNode() {
    Optional<VariableNode> propertyNode =
        getPropertyNode(CertificateRequestedAuditEventType.CERTIFICATE_GROUP);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public NodeId getCertificateGroup() {
    return getProperty(CertificateRequestedAuditEventType.CERTIFICATE_GROUP).orElse(null);
  }

  @Override
  public void setCertificateGroup(NodeId value) {
    setProperty(CertificateRequestedAuditEventType.CERTIFICATE_GROUP, value);
  }

  @Override
  public PropertyTypeNode getCertificateTypeNode() {
    Optional<VariableNode> propertyNode =
        getPropertyNode(CertificateRequestedAuditEventType.CERTIFICATE_TYPE);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public NodeId getCertificateType() {
    return getProperty(CertificateRequestedAuditEventType.CERTIFICATE_TYPE).orElse(null);
  }

  @Override
  public void setCertificateType(NodeId value) {
    setProperty(CertificateRequestedAuditEventType.CERTIFICATE_TYPE, value);
  }
}
