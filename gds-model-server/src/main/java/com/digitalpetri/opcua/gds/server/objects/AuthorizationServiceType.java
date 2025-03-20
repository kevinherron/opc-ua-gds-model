package com.digitalpetri.opcua.gds.server.objects;

import org.eclipse.milo.opcua.sdk.core.QualifiedProperty;
import org.eclipse.milo.opcua.sdk.core.nodes.MethodNode;
import org.eclipse.milo.opcua.sdk.server.methods.AbstractMethodInvocationHandler;
import org.eclipse.milo.opcua.sdk.server.methods.Out;
import org.eclipse.milo.opcua.sdk.server.model.objects.BaseObjectType;
import org.eclipse.milo.opcua.sdk.server.model.variables.PropertyType;
import org.eclipse.milo.opcua.sdk.server.nodes.UaMethodNode;
import org.eclipse.milo.opcua.stack.core.NamespaceTable;
import org.eclipse.milo.opcua.stack.core.UaException;
import org.eclipse.milo.opcua.stack.core.types.builtin.ByteString;
import org.eclipse.milo.opcua.stack.core.types.builtin.ExpandedNodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.builtin.Variant;
import org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.UInteger;
import org.eclipse.milo.opcua.stack.core.types.structured.Argument;
import org.eclipse.milo.opcua.stack.core.types.structured.UserIdentityToken;
import org.eclipse.milo.opcua.stack.core.types.structured.UserTokenPolicy;
import org.eclipse.milo.opcua.stack.core.util.Lazy;

/**
 * @see <a
 *     href="https://reference.opcfoundation.org/GDS/docs/9.6.4">https://reference.opcfoundation.org/GDS/docs/9.6.4</a>
 */
public interface AuthorizationServiceType extends BaseObjectType {
  QualifiedProperty<String> SERVICE_URI =
      new QualifiedProperty<>(
          "http://opcfoundation.org/UA/GDS/",
          "ServiceUri",
          ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/;i=12"),
          -1,
          String.class);

  QualifiedProperty<ByteString> SERVICE_CERTIFICATE =
      new QualifiedProperty<>(
          "http://opcfoundation.org/UA/GDS/",
          "ServiceCertificate",
          ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/;i=15"),
          -1,
          ByteString.class);

  QualifiedProperty<UserTokenPolicy[]> USER_TOKEN_POLICIES =
      new QualifiedProperty<>(
          "http://opcfoundation.org/UA/GDS/",
          "UserTokenPolicies",
          ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/;i=304"),
          1,
          UserTokenPolicy[].class);

  String getServiceUri();

  void setServiceUri(String value);

  PropertyType getServiceUriNode();

  ByteString getServiceCertificate();

  void setServiceCertificate(ByteString value);

  PropertyType getServiceCertificateNode();

  UserTokenPolicy[] getUserTokenPolicies();

  void setUserTokenPolicies(UserTokenPolicy[] value);

  PropertyType getUserTokenPoliciesNode();

  MethodNode getGetServiceDescriptionMethodNode();

  MethodNode getRequestAccessTokenMethodNode();

  abstract class GetServiceDescriptionMethod extends AbstractMethodInvocationHandler {
    private final Lazy<Argument[]> outputArguments = new Lazy<>();

    public GetServiceDescriptionMethod(UaMethodNode node) {
      super(node);
    }

    @Override
    public Argument[] getInputArguments() {
      return new Argument[] {};
    }

    @Override
    public Argument[] getOutputArguments() {
      return outputArguments.get(
          () -> {
            NamespaceTable namespaceTable = getNode().getNodeContext().getNamespaceTable();

            return new Argument[] {
              new Argument(
                  "ServiceUri",
                  ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/;i=12")
                      .toNodeId(namespaceTable)
                      .orElseThrow(),
                  -1,
                  null,
                  new LocalizedText("", "")),
              new Argument(
                  "ServiceCertificate",
                  ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/;i=15")
                      .toNodeId(namespaceTable)
                      .orElseThrow(),
                  -1,
                  null,
                  new LocalizedText("", "")),
              new Argument(
                  "UserTokenPolicies",
                  ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/;i=304")
                      .toNodeId(namespaceTable)
                      .orElseThrow(),
                  1,
                  new UInteger[] {UInteger.valueOf(0)},
                  new LocalizedText("", ""))
            };
          });
    }

    @Override
    protected Variant[] invoke(InvocationContext context, Variant[] inputValues)
        throws UaException {
      Out<String> serviceUri = new Out<>();
      Out<ByteString> serviceCertificate = new Out<>();
      Out<UserTokenPolicy[]> userTokenPolicies = new Out<>();
      invoke(context, serviceUri, serviceCertificate, userTokenPolicies);
      return new Variant[] {
        new Variant(serviceUri.get()),
        new Variant(serviceCertificate.get()),
        new Variant(userTokenPolicies.get())
      };
    }

    protected abstract void invoke(
        InvocationContext context,
        Out<String> serviceUri,
        Out<ByteString> serviceCertificate,
        Out<UserTokenPolicy[]> userTokenPolicies)
        throws UaException;
  }

  abstract class RequestAccessTokenMethod extends AbstractMethodInvocationHandler {
    private final Lazy<Argument[]> inputArguments = new Lazy<>();

    private final Lazy<Argument[]> outputArguments = new Lazy<>();

    public RequestAccessTokenMethod(UaMethodNode node) {
      super(node);
    }

    @Override
    public Argument[] getInputArguments() {
      return inputArguments.get(
          () -> {
            NamespaceTable namespaceTable = getNode().getNodeContext().getNamespaceTable();

            return new Argument[] {
              new Argument(
                  "IdentityToken",
                  ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/;i=316")
                      .toNodeId(namespaceTable)
                      .orElseThrow(),
                  -1,
                  null,
                  new LocalizedText("", "")),
              new Argument(
                  "ResourceId",
                  ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/;i=12")
                      .toNodeId(namespaceTable)
                      .orElseThrow(),
                  -1,
                  null,
                  new LocalizedText("", ""))
            };
          });
    }

    @Override
    public Argument[] getOutputArguments() {
      return outputArguments.get(
          () -> {
            NamespaceTable namespaceTable = getNode().getNodeContext().getNamespaceTable();

            return new Argument[] {
              new Argument(
                  "AccessToken",
                  ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/;i=12")
                      .toNodeId(namespaceTable)
                      .orElseThrow(),
                  -1,
                  null,
                  new LocalizedText("", ""))
            };
          });
    }

    @Override
    protected Variant[] invoke(InvocationContext context, Variant[] inputValues)
        throws UaException {
      UserIdentityToken identityToken = (UserIdentityToken) inputValues[0].getValue();
      String resourceId = (String) inputValues[1].getValue();
      Out<String> accessToken = new Out<>();
      invoke(context, identityToken, resourceId, accessToken);
      return new Variant[] {new Variant(accessToken.get())};
    }

    protected abstract void invoke(
        InvocationContext context,
        UserIdentityToken identityToken,
        String resourceId,
        Out<String> accessToken)
        throws UaException;
  }
}
