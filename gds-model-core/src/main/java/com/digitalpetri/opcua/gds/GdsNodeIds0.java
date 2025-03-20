package com.digitalpetri.opcua.gds;

import static org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.Unsigned.uint;

import org.eclipse.milo.opcua.stack.core.types.builtin.ExpandedNodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.UShort;

abstract class GdsNodeIds0 extends GdsNodeIdsBase {
  public static final ExpandedNodeId ApplicationRecordDataType =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1));

  public static final ExpandedNodeId DirectoryType =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(13));

  public static final ExpandedNodeId DirectoryType_Applications =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(14));

  public static final ExpandedNodeId DirectoryType_FindApplications =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(15));

  public static final ExpandedNodeId DirectoryType_FindApplications_InputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(16));

  public static final ExpandedNodeId DirectoryType_FindApplications_OutputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(17));

  public static final ExpandedNodeId DirectoryType_RegisterApplication =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(18));

  public static final ExpandedNodeId DirectoryType_RegisterApplication_InputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(19));

  public static final ExpandedNodeId DirectoryType_RegisterApplication_OutputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(20));

  public static final ExpandedNodeId DirectoryType_UnregisterApplication =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(21));

  public static final ExpandedNodeId DirectoryType_UnregisterApplication_InputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(22));

  public static final ExpandedNodeId DirectoryType_QueryServers =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(23));

  public static final ExpandedNodeId DirectoryType_QueryServers_InputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(24));

  public static final ExpandedNodeId DirectoryType_QueryServers_OutputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(25));

  public static final ExpandedNodeId ApplicationRegistrationChangedAuditEventType =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(26));

  public static final ExpandedNodeId KeyCredentialManagementFolderType =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(55));

  public static final ExpandedNodeId KeyCredentialManagementFolderType_ServiceName_Placeholder =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(61));

  public static final ExpandedNodeId CertificateDirectoryType =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(63));

  public static final ExpandedNodeId CertificateDirectoryType_StartNewKeyPairRequest =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(76));

  public static final ExpandedNodeId
      CertificateDirectoryType_StartNewKeyPairRequest_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(77));

  public static final ExpandedNodeId
      CertificateDirectoryType_StartNewKeyPairRequest_OutputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(78));

  public static final ExpandedNodeId CertificateDirectoryType_StartSigningRequest =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(79));

  public static final ExpandedNodeId CertificateDirectoryType_StartSigningRequest_InputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(80));

  public static final ExpandedNodeId CertificateDirectoryType_StartSigningRequest_OutputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(81));

  public static final ExpandedNodeId
      KeyCredentialManagementFolderType_ServiceName_Placeholder_ResourceUri =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(83));

  public static final ExpandedNodeId CertificateDirectoryType_FinishRequest =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(85));

  public static final ExpandedNodeId CertificateDirectoryType_FinishRequest_InputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(86));

  public static final ExpandedNodeId CertificateDirectoryType_FinishRequest_OutputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(87));

  public static final ExpandedNodeId CertificateDirectoryType_GetCertificates =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(89));

  public static final ExpandedNodeId CertificateDirectoryType_GetCertificates_InputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(90));

  public static final ExpandedNodeId CertificateRequestedAuditEventType =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(91));

  public static final ExpandedNodeId CertificateDirectoryType_GetCertificates_OutputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(108));

  public static final ExpandedNodeId CertificateDeliveredAuditEventType =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(109));

  public static final ExpandedNodeId CertificateDirectoryType_CheckRevocationStatus =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(126));

  public static final ExpandedNodeId ApplicationRecordDataType_Encoding_DefaultXml =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(127));

  public static final ExpandedNodeId OpcUaGds_XmlSchema =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(128));

  public static final ExpandedNodeId OpcUaGds_XmlSchema_NamespaceUri =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(130));

  public static final ExpandedNodeId OpcUaGds_XmlSchema_ApplicationRecordDataType =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(131));

  public static final ExpandedNodeId ApplicationRecordDataType_Encoding_DefaultBinary =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(134));

  public static final ExpandedNodeId OpcUaGds_BinarySchema =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(135));

  public static final ExpandedNodeId OpcUaGds_BinarySchema_NamespaceUri =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(137));

  public static final ExpandedNodeId OpcUaGds_BinarySchema_ApplicationRecordDataType =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(138));

  public static final ExpandedNodeId Directory =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(141));

  public static final ExpandedNodeId Directory_Applications =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(142));

  public static final ExpandedNodeId Directory_FindApplications =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(143));

  public static final ExpandedNodeId Directory_FindApplications_InputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(144));

  public static final ExpandedNodeId Directory_FindApplications_OutputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(145));

  public static final ExpandedNodeId Directory_RegisterApplication =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(146));

  public static final ExpandedNodeId Directory_RegisterApplication_InputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(147));

  public static final ExpandedNodeId Directory_RegisterApplication_OutputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(148));

  public static final ExpandedNodeId Directory_UnregisterApplication =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(149));

  public static final ExpandedNodeId Directory_UnregisterApplication_InputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(150));

  public static final ExpandedNodeId Directory_QueryServers =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(151));

  public static final ExpandedNodeId Directory_QueryServers_InputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(152));

  public static final ExpandedNodeId Directory_QueryServers_OutputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(153));

  public static final ExpandedNodeId Directory_StartNewKeyPairRequest =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(154));

  public static final ExpandedNodeId Directory_StartNewKeyPairRequest_InputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(155));

  public static final ExpandedNodeId Directory_StartNewKeyPairRequest_OutputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(156));

  public static final ExpandedNodeId Directory_StartSigningRequest =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(157));

  public static final ExpandedNodeId Directory_StartSigningRequest_InputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(158));

  public static final ExpandedNodeId Directory_StartSigningRequest_OutputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(159));

  public static final ExpandedNodeId CertificateDirectoryType_CheckRevocationStatus_InputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(160));

  public static final ExpandedNodeId
      CertificateDirectoryType_CheckRevocationStatus_OutputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(161));

  public static final ExpandedNodeId
      KeyCredentialManagementFolderType_ServiceName_Placeholder_ProfileUris =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(162));

  public static final ExpandedNodeId Directory_FinishRequest =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(163));

  public static final ExpandedNodeId Directory_FinishRequest_InputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(164));

  public static final ExpandedNodeId Directory_FinishRequest_OutputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(165));

  public static final ExpandedNodeId
      KeyCredentialManagementFolderType_ServiceName_Placeholder_StartRequest =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(168));

  public static final ExpandedNodeId
      KeyCredentialManagementFolderType_ServiceName_Placeholder_StartRequest_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(171));

  public static final ExpandedNodeId DirectoryType_UpdateApplication =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(188));

  public static final ExpandedNodeId DirectoryType_UpdateApplication_InputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(189));

  public static final ExpandedNodeId
      KeyCredentialManagementFolderType_ServiceName_Placeholder_StartRequest_OutputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(195));

  public static final ExpandedNodeId
      KeyCredentialManagementFolderType_ServiceName_Placeholder_FinishRequest =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(196));

  public static final ExpandedNodeId CertificateDirectoryType_GetTrustList =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(197));

  public static final ExpandedNodeId CertificateDirectoryType_GetTrustList_InputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(198));

  public static final ExpandedNodeId CertificateDirectoryType_GetTrustList_OutputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(199));

  public static final ExpandedNodeId Directory_UpdateApplication =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(200));

  public static final ExpandedNodeId Directory_UpdateApplication_InputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(201));

  public static final ExpandedNodeId
      KeyCredentialManagementFolderType_ServiceName_Placeholder_FinishRequest_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(202));

  public static final ExpandedNodeId
      KeyCredentialManagementFolderType_ServiceName_Placeholder_FinishRequest_OutputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(203));

  public static final ExpandedNodeId Directory_GetTrustList =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(204));

  public static final ExpandedNodeId Directory_GetTrustList_InputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(205));

  public static final ExpandedNodeId Directory_GetTrustList_OutputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(206));

  public static final ExpandedNodeId DirectoryType_GetApplication =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(210));

  public static final ExpandedNodeId DirectoryType_GetApplication_InputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(211));

  public static final ExpandedNodeId DirectoryType_GetApplication_OutputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(212));

  public static final ExpandedNodeId Directory_GetApplication =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(216));

  public static final ExpandedNodeId Directory_GetApplication_InputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(217));

  public static final ExpandedNodeId Directory_GetApplication_OutputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(218));

  public static final ExpandedNodeId CertificateDirectoryType_GetCertificateStatus =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(222));

  public static final ExpandedNodeId CertificateDirectoryType_GetCertificateStatus_InputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(223));

  public static final ExpandedNodeId CertificateDirectoryType_GetCertificateStatus_OutputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(224));

  public static final ExpandedNodeId Directory_GetCertificateStatus =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(225));

  public static final ExpandedNodeId Directory_GetCertificateStatus_InputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(226));

  public static final ExpandedNodeId Directory_GetCertificateStatus_OutputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(227));

  public static final ExpandedNodeId AuthorizationServicesFolderType =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(233));

  public static final ExpandedNodeId AuthorizationServicesFolderType_ServiceName_Placeholder =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(234));

  public static final ExpandedNodeId
      AuthorizationServicesFolderType_ServiceName_Placeholder_ServiceUri =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(235));

  public static final ExpandedNodeId
      AuthorizationServicesFolderType_ServiceName_Placeholder_ServiceCertificate =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(236));

  public static final ExpandedNodeId
      AuthorizationServicesFolderType_ServiceName_Placeholder_GetServiceDescription =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(238));

  public static final ExpandedNodeId
      AuthorizationServicesFolderType_ServiceName_Placeholder_GetServiceDescription_OutputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(239));

  public static final ExpandedNodeId CertificateDirectoryType_GetCertificateGroups =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(369));

  public static final ExpandedNodeId CertificateDirectoryType_GetCertificateGroups_InputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(370));

  public static final ExpandedNodeId CertificateDirectoryType_GetCertificateGroups_OutputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(371));

  public static final ExpandedNodeId KeyCredentialServiceType_SecurityPolicyUris =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(495));

  public static final ExpandedNodeId Directory_GetCertificateGroups =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(508));

  public static final ExpandedNodeId Directory_GetCertificateGroups_InputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(509));

  public static final ExpandedNodeId Directory_GetCertificateGroups_OutputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(510));

  public static final ExpandedNodeId CertificateDirectoryType_CertificateGroups =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(511));

  public static final ExpandedNodeId
      CertificateDirectoryType_CertificateGroups_DefaultApplicationGroup =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(512));

  public static final ExpandedNodeId
      CertificateDirectoryType_CertificateGroups_DefaultApplicationGroup_TrustList =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(513));

  public static final ExpandedNodeId
      CertificateDirectoryType_CertificateGroups_DefaultApplicationGroup_TrustList_Size =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(514));

  public static final ExpandedNodeId
      CertificateDirectoryType_CertificateGroups_DefaultApplicationGroup_TrustList_Writable =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(515));

  public static final ExpandedNodeId
      CertificateDirectoryType_CertificateGroups_DefaultApplicationGroup_TrustList_UserWritable =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(516));

  public static final ExpandedNodeId
      CertificateDirectoryType_CertificateGroups_DefaultApplicationGroup_TrustList_OpenCount =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(517));

  public static final ExpandedNodeId
      CertificateDirectoryType_CertificateGroups_DefaultApplicationGroup_TrustList_Open =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(519));

  public static final ExpandedNodeId
      CertificateDirectoryType_CertificateGroups_DefaultApplicationGroup_TrustList_Open_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(520));

  public static final ExpandedNodeId
      CertificateDirectoryType_CertificateGroups_DefaultApplicationGroup_TrustList_Open_OutputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(521));

  public static final ExpandedNodeId
      CertificateDirectoryType_CertificateGroups_DefaultApplicationGroup_TrustList_Close =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(522));

  public static final ExpandedNodeId
      CertificateDirectoryType_CertificateGroups_DefaultApplicationGroup_TrustList_Close_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(523));

  public static final ExpandedNodeId
      CertificateDirectoryType_CertificateGroups_DefaultApplicationGroup_TrustList_Read =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(524));

  public static final ExpandedNodeId
      CertificateDirectoryType_CertificateGroups_DefaultApplicationGroup_TrustList_Read_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(525));

  public static final ExpandedNodeId
      CertificateDirectoryType_CertificateGroups_DefaultApplicationGroup_TrustList_Read_OutputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(526));

  public static final ExpandedNodeId
      CertificateDirectoryType_CertificateGroups_DefaultApplicationGroup_TrustList_Write =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(527));

  public static final ExpandedNodeId
      CertificateDirectoryType_CertificateGroups_DefaultApplicationGroup_TrustList_Write_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(528));

  public static final ExpandedNodeId
      CertificateDirectoryType_CertificateGroups_DefaultApplicationGroup_TrustList_GetPosition =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(529));

  public static final ExpandedNodeId
      CertificateDirectoryType_CertificateGroups_DefaultApplicationGroup_TrustList_GetPosition_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(530));

  public static final ExpandedNodeId
      CertificateDirectoryType_CertificateGroups_DefaultApplicationGroup_TrustList_GetPosition_OutputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(531));

  public static final ExpandedNodeId
      CertificateDirectoryType_CertificateGroups_DefaultApplicationGroup_TrustList_SetPosition =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(532));

  public static final ExpandedNodeId
      CertificateDirectoryType_CertificateGroups_DefaultApplicationGroup_TrustList_SetPosition_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(533));

  public static final ExpandedNodeId
      CertificateDirectoryType_CertificateGroups_DefaultApplicationGroup_TrustList_LastUpdateTime =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(534));

  public static final ExpandedNodeId
      CertificateDirectoryType_CertificateGroups_DefaultApplicationGroup_TrustList_OpenWithMasks =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(535));

  public static final ExpandedNodeId
      CertificateDirectoryType_CertificateGroups_DefaultApplicationGroup_TrustList_OpenWithMasks_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(536));

  public static final ExpandedNodeId
      CertificateDirectoryType_CertificateGroups_DefaultApplicationGroup_TrustList_OpenWithMasks_OutputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(537));

  public static final ExpandedNodeId
      CertificateDirectoryType_CertificateGroups_DefaultApplicationGroup_TrustList_CloseAndUpdate =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(538));

  public static final ExpandedNodeId
      CertificateDirectoryType_CertificateGroups_DefaultApplicationGroup_TrustList_CloseAndUpdate_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(539));

  public static final ExpandedNodeId
      CertificateDirectoryType_CertificateGroups_DefaultApplicationGroup_TrustList_CloseAndUpdate_OutputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(540));

  public static final ExpandedNodeId
      CertificateDirectoryType_CertificateGroups_DefaultApplicationGroup_TrustList_AddCertificate =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(541));

  public static final ExpandedNodeId
      CertificateDirectoryType_CertificateGroups_DefaultApplicationGroup_TrustList_AddCertificate_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(542));

  public static final ExpandedNodeId
      CertificateDirectoryType_CertificateGroups_DefaultApplicationGroup_TrustList_RemoveCertificate =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(543));

  public static final ExpandedNodeId
      CertificateDirectoryType_CertificateGroups_DefaultApplicationGroup_TrustList_RemoveCertificate_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(544));

  public static final ExpandedNodeId
      CertificateDirectoryType_CertificateGroups_DefaultApplicationGroup_CertificateTypes =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(545));

  public static final ExpandedNodeId Directory_CertificateGroups =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(614));

  public static final ExpandedNodeId Directory_CertificateGroups_DefaultApplicationGroup =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(615));

  public static final ExpandedNodeId Directory_CertificateGroups_DefaultApplicationGroup_TrustList =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(616));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultApplicationGroup_TrustList_Size =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(617));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultApplicationGroup_TrustList_Writable =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(618));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultApplicationGroup_TrustList_UserWritable =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(619));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultApplicationGroup_TrustList_OpenCount =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(620));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultApplicationGroup_TrustList_Open =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(622));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultApplicationGroup_TrustList_Open_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(623));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultApplicationGroup_TrustList_Open_OutputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(624));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultApplicationGroup_TrustList_Close =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(625));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultApplicationGroup_TrustList_Close_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(626));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultApplicationGroup_TrustList_Read =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(627));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultApplicationGroup_TrustList_Read_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(628));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultApplicationGroup_TrustList_Read_OutputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(629));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultApplicationGroup_TrustList_Write =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(630));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultApplicationGroup_TrustList_Write_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(631));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultApplicationGroup_TrustList_GetPosition =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(632));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultApplicationGroup_TrustList_GetPosition_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(633));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultApplicationGroup_TrustList_GetPosition_OutputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(634));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultApplicationGroup_TrustList_SetPosition =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(635));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultApplicationGroup_TrustList_SetPosition_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(636));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultApplicationGroup_TrustList_LastUpdateTime =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(637));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultApplicationGroup_TrustList_OpenWithMasks =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(638));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultApplicationGroup_TrustList_OpenWithMasks_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(639));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultApplicationGroup_TrustList_OpenWithMasks_OutputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(640));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultApplicationGroup_TrustList_CloseAndUpdate =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(641));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultApplicationGroup_TrustList_CloseAndUpdate_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(642));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultApplicationGroup_TrustList_CloseAndUpdate_OutputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(643));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultApplicationGroup_TrustList_AddCertificate =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(644));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultApplicationGroup_TrustList_AddCertificate_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(645));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultApplicationGroup_TrustList_RemoveCertificate =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(646));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultApplicationGroup_TrustList_RemoveCertificate_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(647));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultApplicationGroup_CertificateTypes =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(648));

  public static final ExpandedNodeId Directory_CertificateGroups_DefaultHttpsGroup =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(649));

  public static final ExpandedNodeId Directory_CertificateGroups_DefaultHttpsGroup_TrustList =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(650));

  public static final ExpandedNodeId Directory_CertificateGroups_DefaultHttpsGroup_TrustList_Size =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(651));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultHttpsGroup_TrustList_Writable =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(652));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultHttpsGroup_TrustList_UserWritable =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(653));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultHttpsGroup_TrustList_OpenCount =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(654));

  public static final ExpandedNodeId Directory_CertificateGroups_DefaultHttpsGroup_TrustList_Open =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(656));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultHttpsGroup_TrustList_Open_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(657));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultHttpsGroup_TrustList_Open_OutputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(658));

  public static final ExpandedNodeId Directory_CertificateGroups_DefaultHttpsGroup_TrustList_Close =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(659));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultHttpsGroup_TrustList_Close_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(660));

  public static final ExpandedNodeId Directory_CertificateGroups_DefaultHttpsGroup_TrustList_Read =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(661));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultHttpsGroup_TrustList_Read_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(662));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultHttpsGroup_TrustList_Read_OutputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(663));

  public static final ExpandedNodeId Directory_CertificateGroups_DefaultHttpsGroup_TrustList_Write =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(664));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultHttpsGroup_TrustList_Write_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(665));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultHttpsGroup_TrustList_GetPosition =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(666));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultHttpsGroup_TrustList_GetPosition_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(667));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultHttpsGroup_TrustList_GetPosition_OutputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(668));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultHttpsGroup_TrustList_SetPosition =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(669));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultHttpsGroup_TrustList_SetPosition_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(670));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultHttpsGroup_TrustList_LastUpdateTime =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(671));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultHttpsGroup_TrustList_OpenWithMasks =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(672));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultHttpsGroup_TrustList_OpenWithMasks_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(673));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultHttpsGroup_TrustList_OpenWithMasks_OutputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(674));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultHttpsGroup_TrustList_CloseAndUpdate =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(675));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultHttpsGroup_TrustList_CloseAndUpdate_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(676));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultHttpsGroup_TrustList_CloseAndUpdate_OutputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(677));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultHttpsGroup_TrustList_AddCertificate =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(678));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultHttpsGroup_TrustList_AddCertificate_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(679));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultHttpsGroup_TrustList_RemoveCertificate =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(680));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultHttpsGroup_TrustList_RemoveCertificate_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(681));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultHttpsGroup_CertificateTypes =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(682));

  public static final ExpandedNodeId Directory_CertificateGroups_DefaultUserTokenGroup =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(683));

  public static final ExpandedNodeId Directory_CertificateGroups_DefaultUserTokenGroup_TrustList =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(684));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultUserTokenGroup_TrustList_Size =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(685));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultUserTokenGroup_TrustList_Writable =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(686));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultUserTokenGroup_TrustList_UserWritable =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(687));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultUserTokenGroup_TrustList_OpenCount =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(688));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultUserTokenGroup_TrustList_Open =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(690));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultUserTokenGroup_TrustList_Open_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(691));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultUserTokenGroup_TrustList_Open_OutputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(692));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultUserTokenGroup_TrustList_Close =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(693));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultUserTokenGroup_TrustList_Close_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(694));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultUserTokenGroup_TrustList_Read =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(695));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultUserTokenGroup_TrustList_Read_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(696));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultUserTokenGroup_TrustList_Read_OutputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(697));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultUserTokenGroup_TrustList_Write =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(698));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultUserTokenGroup_TrustList_Write_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(699));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultUserTokenGroup_TrustList_GetPosition =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(700));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultUserTokenGroup_TrustList_GetPosition_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(701));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultUserTokenGroup_TrustList_GetPosition_OutputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(702));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultUserTokenGroup_TrustList_SetPosition =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(703));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultUserTokenGroup_TrustList_SetPosition_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(704));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultUserTokenGroup_TrustList_LastUpdateTime =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(705));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultUserTokenGroup_TrustList_OpenWithMasks =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(706));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultUserTokenGroup_TrustList_OpenWithMasks_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(707));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultUserTokenGroup_TrustList_OpenWithMasks_OutputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(708));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultUserTokenGroup_TrustList_CloseAndUpdate =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(709));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultUserTokenGroup_TrustList_CloseAndUpdate_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(710));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultUserTokenGroup_TrustList_CloseAndUpdate_OutputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(711));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultUserTokenGroup_TrustList_AddCertificate =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(712));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultUserTokenGroup_TrustList_AddCertificate_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(713));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultUserTokenGroup_TrustList_RemoveCertificate =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(714));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultUserTokenGroup_TrustList_RemoveCertificate_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(715));

  public static final ExpandedNodeId
      Directory_CertificateGroups_DefaultUserTokenGroup_CertificateTypes =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(716));

  public static final ExpandedNodeId CertificateRequestedAuditEventType_CertificateGroup =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(717));

  public static final ExpandedNodeId CertificateRequestedAuditEventType_CertificateType =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(718));

  public static final ExpandedNodeId CertificateDeliveredAuditEventType_CertificateGroup =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(719));

  public static final ExpandedNodeId CertificateDeliveredAuditEventType_CertificateType =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(720));

  public static final ExpandedNodeId OPCUAGDSNamespaceMetadata =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(721));

  public static final ExpandedNodeId OPCUAGDSNamespaceMetadata_NamespaceUri =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(722));

  public static final ExpandedNodeId OPCUAGDSNamespaceMetadata_NamespaceVersion =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(723));

  public static final ExpandedNodeId OPCUAGDSNamespaceMetadata_NamespacePublicationDate =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(724));

  public static final ExpandedNodeId OPCUAGDSNamespaceMetadata_IsNamespaceSubset =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(725));

  public static final ExpandedNodeId OPCUAGDSNamespaceMetadata_StaticNodeIdTypes =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(726));

  public static final ExpandedNodeId OPCUAGDSNamespaceMetadata_StaticNumericNodeIdRange =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(727));

  public static final ExpandedNodeId OPCUAGDSNamespaceMetadata_StaticStringNodeIdPattern =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(728));

  public static final ExpandedNodeId OPCUAGDSNamespaceMetadata_DefaultRolePermissions =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(862));

  public static final ExpandedNodeId OPCUAGDSNamespaceMetadata_DefaultUserRolePermissions =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(863));

  public static final ExpandedNodeId OPCUAGDSNamespaceMetadata_DefaultAccessRestrictions =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(864));

  public static final ExpandedNodeId DirectoryType_QueryApplications =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(868));

  public static final ExpandedNodeId DirectoryType_QueryApplications_InputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(869));

  public static final ExpandedNodeId DirectoryType_QueryApplications_OutputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(870));

  public static final ExpandedNodeId AuthorizationServices =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(959));

  public static final ExpandedNodeId AuthorizationServiceType =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(966));

  public static final ExpandedNodeId AuthorizationServiceType_UserTokenPolicies =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(967));

  public static final ExpandedNodeId AuthorizationServiceType_ServiceCertificate =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(968));

  public static final ExpandedNodeId AuthorizationServiceType_RequestAccessToken =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(969));

  public static final ExpandedNodeId AuthorizationServiceType_RequestAccessToken_InputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(970));

  public static final ExpandedNodeId AuthorizationServiceType_RequestAccessToken_OutputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(971));

  public static final ExpandedNodeId AccessTokenIssuedAuditEventType =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(975));

  public static final ExpandedNodeId Directory_QueryApplications =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(992));

  public static final ExpandedNodeId Directory_QueryApplications_InputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(993));

  public static final ExpandedNodeId Directory_QueryApplications_OutputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(994));

  public static final ExpandedNodeId AuthorizationServiceType_ServiceUri =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1003));

  public static final ExpandedNodeId AuthorizationServiceType_GetServiceDescription =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1004));

  public static final ExpandedNodeId
      AuthorizationServiceType_GetServiceDescription_OutputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1005));

  public static final ExpandedNodeId KeyCredentialManagement =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1008));

  public static final ExpandedNodeId KeyCredentialServiceType =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1020));

  public static final ExpandedNodeId KeyCredentialServiceType_ResourceUri =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1021));

  public static final ExpandedNodeId KeyCredentialServiceType_ProfileUris =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1022));

  public static final ExpandedNodeId KeyCredentialServiceType_StartRequest =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1023));

  public static final ExpandedNodeId KeyCredentialServiceType_StartRequest_InputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1024));

  public static final ExpandedNodeId KeyCredentialServiceType_StartRequest_OutputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1025));

  public static final ExpandedNodeId KeyCredentialServiceType_FinishRequest =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1026));

  public static final ExpandedNodeId KeyCredentialServiceType_FinishRequest_InputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1027));

  public static final ExpandedNodeId KeyCredentialServiceType_FinishRequest_OutputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1028));

  public static final ExpandedNodeId KeyCredentialServiceType_Revoke =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1029));

  public static final ExpandedNodeId KeyCredentialServiceType_Revoke_InputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1030));

  public static final ExpandedNodeId KeyCredentialRequestedAuditEventType =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1039));

  public static final ExpandedNodeId KeyCredentialDeliveredAuditEventType =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1057));

  public static final ExpandedNodeId KeyCredentialRevokedAuditEventType =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1075));

  public static final ExpandedNodeId WellKnownRole_DiscoveryAdmin =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1661));

  public static final ExpandedNodeId WellKnownRole_DiscoveryAdmin_Identities =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1662));

  public static final ExpandedNodeId WellKnownRole_DiscoveryAdmin_ApplicationsExclude =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1663));

  public static final ExpandedNodeId WellKnownRole_DiscoveryAdmin_Applications =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1664));

  public static final ExpandedNodeId WellKnownRole_DiscoveryAdmin_EndpointsExclude =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1665));

  public static final ExpandedNodeId WellKnownRole_DiscoveryAdmin_Endpoints =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1666));

  public static final ExpandedNodeId WellKnownRole_DiscoveryAdmin_AddIdentity =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1668));

  public static final ExpandedNodeId WellKnownRole_DiscoveryAdmin_AddIdentity_InputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1669));

  public static final ExpandedNodeId WellKnownRole_DiscoveryAdmin_RemoveIdentity =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1670));

  public static final ExpandedNodeId WellKnownRole_DiscoveryAdmin_RemoveIdentity_InputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1671));

  public static final ExpandedNodeId WellKnownRole_DiscoveryAdmin_AddApplication =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1672));

  public static final ExpandedNodeId WellKnownRole_DiscoveryAdmin_AddApplication_InputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1673));

  public static final ExpandedNodeId WellKnownRole_DiscoveryAdmin_RemoveApplication =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1674));

  public static final ExpandedNodeId WellKnownRole_DiscoveryAdmin_RemoveApplication_InputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1675));

  public static final ExpandedNodeId WellKnownRole_DiscoveryAdmin_AddEndpoint =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1676));

  public static final ExpandedNodeId WellKnownRole_DiscoveryAdmin_AddEndpoint_InputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1677));

  public static final ExpandedNodeId WellKnownRole_DiscoveryAdmin_RemoveEndpoint =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1678));

  public static final ExpandedNodeId WellKnownRole_DiscoveryAdmin_RemoveEndpoint_InputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1679));

  public static final ExpandedNodeId WellKnownRole_CertificateAuthorityAdmin =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1680));

  public static final ExpandedNodeId WellKnownRole_CertificateAuthorityAdmin_Identities =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1681));

  public static final ExpandedNodeId WellKnownRole_CertificateAuthorityAdmin_ApplicationsExclude =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1682));

  public static final ExpandedNodeId WellKnownRole_CertificateAuthorityAdmin_Applications =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1683));

  public static final ExpandedNodeId WellKnownRole_CertificateAuthorityAdmin_EndpointsExclude =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1684));

  public static final ExpandedNodeId WellKnownRole_CertificateAuthorityAdmin_Endpoints =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1685));

  public static final ExpandedNodeId WellKnownRole_CertificateAuthorityAdmin_AddIdentity =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1687));

  public static final ExpandedNodeId
      WellKnownRole_CertificateAuthorityAdmin_AddIdentity_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1688));

  public static final ExpandedNodeId WellKnownRole_CertificateAuthorityAdmin_RemoveIdentity =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1689));

  public static final ExpandedNodeId
      WellKnownRole_CertificateAuthorityAdmin_RemoveIdentity_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1690));

  public static final ExpandedNodeId WellKnownRole_CertificateAuthorityAdmin_AddApplication =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1691));

  public static final ExpandedNodeId
      WellKnownRole_CertificateAuthorityAdmin_AddApplication_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1692));

  public static final ExpandedNodeId WellKnownRole_CertificateAuthorityAdmin_RemoveApplication =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1693));

  public static final ExpandedNodeId
      WellKnownRole_CertificateAuthorityAdmin_RemoveApplication_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1694));

  public static final ExpandedNodeId WellKnownRole_CertificateAuthorityAdmin_AddEndpoint =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1695));

  public static final ExpandedNodeId
      WellKnownRole_CertificateAuthorityAdmin_AddEndpoint_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1696));

  public static final ExpandedNodeId WellKnownRole_CertificateAuthorityAdmin_RemoveEndpoint =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1697));

  public static final ExpandedNodeId
      WellKnownRole_CertificateAuthorityAdmin_RemoveEndpoint_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1698));

  public static final ExpandedNodeId WellKnownRole_RegistrationAuthorityAdmin =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1699));

  public static final ExpandedNodeId WellKnownRole_RegistrationAuthorityAdmin_Identities =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1700));

  public static final ExpandedNodeId WellKnownRole_RegistrationAuthorityAdmin_ApplicationsExclude =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1701));

  public static final ExpandedNodeId WellKnownRole_RegistrationAuthorityAdmin_Applications =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1702));

  public static final ExpandedNodeId WellKnownRole_RegistrationAuthorityAdmin_EndpointsExclude =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1703));

  public static final ExpandedNodeId WellKnownRole_RegistrationAuthorityAdmin_Endpoints =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1704));

  public static final ExpandedNodeId WellKnownRole_RegistrationAuthorityAdmin_AddIdentity =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1706));

  public static final ExpandedNodeId
      WellKnownRole_RegistrationAuthorityAdmin_AddIdentity_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1707));

  public static final ExpandedNodeId WellKnownRole_RegistrationAuthorityAdmin_RemoveIdentity =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1708));

  public static final ExpandedNodeId
      WellKnownRole_RegistrationAuthorityAdmin_RemoveIdentity_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1709));

  public static final ExpandedNodeId WellKnownRole_RegistrationAuthorityAdmin_AddApplication =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1710));

  public static final ExpandedNodeId
      WellKnownRole_RegistrationAuthorityAdmin_AddApplication_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1711));

  public static final ExpandedNodeId WellKnownRole_RegistrationAuthorityAdmin_RemoveApplication =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1712));

  public static final ExpandedNodeId
      WellKnownRole_RegistrationAuthorityAdmin_RemoveApplication_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1713));

  public static final ExpandedNodeId WellKnownRole_RegistrationAuthorityAdmin_AddEndpoint =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1714));

  public static final ExpandedNodeId
      WellKnownRole_RegistrationAuthorityAdmin_AddEndpoint_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1715));

  public static final ExpandedNodeId WellKnownRole_RegistrationAuthorityAdmin_RemoveEndpoint =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1716));

  public static final ExpandedNodeId
      WellKnownRole_RegistrationAuthorityAdmin_RemoveEndpoint_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1717));

  public static final ExpandedNodeId WellKnownRole_KeyCredentialAdmin =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1718));

  public static final ExpandedNodeId WellKnownRole_KeyCredentialAdmin_Identities =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1719));

  public static final ExpandedNodeId WellKnownRole_KeyCredentialAdmin_ApplicationsExclude =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1720));

  public static final ExpandedNodeId WellKnownRole_KeyCredentialAdmin_Applications =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1721));

  public static final ExpandedNodeId WellKnownRole_KeyCredentialAdmin_EndpointsExclude =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1722));

  public static final ExpandedNodeId WellKnownRole_KeyCredentialAdmin_Endpoints =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1723));

  public static final ExpandedNodeId WellKnownRole_KeyCredentialAdmin_AddIdentity =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1725));

  public static final ExpandedNodeId WellKnownRole_KeyCredentialAdmin_AddIdentity_InputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1726));

  public static final ExpandedNodeId WellKnownRole_KeyCredentialAdmin_RemoveIdentity =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1727));

  public static final ExpandedNodeId
      WellKnownRole_KeyCredentialAdmin_RemoveIdentity_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1728));

  public static final ExpandedNodeId WellKnownRole_KeyCredentialAdmin_AddApplication =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1729));

  public static final ExpandedNodeId
      WellKnownRole_KeyCredentialAdmin_AddApplication_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1730));

  public static final ExpandedNodeId WellKnownRole_KeyCredentialAdmin_RemoveApplication =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1731));

  public static final ExpandedNodeId
      WellKnownRole_KeyCredentialAdmin_RemoveApplication_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1732));

  public static final ExpandedNodeId WellKnownRole_KeyCredentialAdmin_AddEndpoint =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1733));

  public static final ExpandedNodeId WellKnownRole_KeyCredentialAdmin_AddEndpoint_InputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1734));

  public static final ExpandedNodeId WellKnownRole_KeyCredentialAdmin_RemoveEndpoint =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1735));

  public static final ExpandedNodeId
      WellKnownRole_KeyCredentialAdmin_RemoveEndpoint_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1736));

  public static final ExpandedNodeId WellKnownRole_AuthorizationServiceAdmin =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1737));

  public static final ExpandedNodeId WellKnownRole_AuthorizationServiceAdmin_Identities =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1738));

  public static final ExpandedNodeId WellKnownRole_AuthorizationServiceAdmin_ApplicationsExclude =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1739));

  public static final ExpandedNodeId WellKnownRole_AuthorizationServiceAdmin_Applications =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1740));

  public static final ExpandedNodeId WellKnownRole_AuthorizationServiceAdmin_EndpointsExclude =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1741));

  public static final ExpandedNodeId WellKnownRole_AuthorizationServiceAdmin_Endpoints =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1742));

  public static final ExpandedNodeId WellKnownRole_AuthorizationServiceAdmin_AddIdentity =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1744));

  public static final ExpandedNodeId
      WellKnownRole_AuthorizationServiceAdmin_AddIdentity_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1745));

  public static final ExpandedNodeId WellKnownRole_AuthorizationServiceAdmin_RemoveIdentity =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1746));

  public static final ExpandedNodeId
      WellKnownRole_AuthorizationServiceAdmin_RemoveIdentity_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1747));

  public static final ExpandedNodeId WellKnownRole_AuthorizationServiceAdmin_AddApplication =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1748));

  public static final ExpandedNodeId
      WellKnownRole_AuthorizationServiceAdmin_AddApplication_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1749));

  public static final ExpandedNodeId WellKnownRole_AuthorizationServiceAdmin_RemoveApplication =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1750));

  public static final ExpandedNodeId
      WellKnownRole_AuthorizationServiceAdmin_RemoveApplication_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1751));

  public static final ExpandedNodeId WellKnownRole_AuthorizationServiceAdmin_AddEndpoint =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1752));

  public static final ExpandedNodeId
      WellKnownRole_AuthorizationServiceAdmin_AddEndpoint_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1753));

  public static final ExpandedNodeId WellKnownRole_AuthorizationServiceAdmin_RemoveEndpoint =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1754));

  public static final ExpandedNodeId
      WellKnownRole_AuthorizationServiceAdmin_RemoveEndpoint_InputArguments =
          new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1755));

  public static final ExpandedNodeId OPCUAGDSNamespaceMetadata_ModelVersion =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(1756));

  public static final ExpandedNodeId ApplicationRecordDataType_Encoding_DefaultJson =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(8001));

  public static final ExpandedNodeId OpcUaGds_BinarySchema_Deprecated =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(8002));

  public static final ExpandedNodeId OpcUaGds_XmlSchema_Deprecated =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(8004));

  public static final ExpandedNodeId CertificateDirectoryType_RevokeCertificate =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(15003));

  public static final ExpandedNodeId CertificateDirectoryType_RevokeCertificate_InputArguments =
      new ExpandedNodeId(UShort.MIN, NAMESPACE_URI, uint(15004));
}
