/*
 * Copyright (c) 2020-2021 - for information on the respective copyright owner
 * see the NOTICE file and/or the repository at
 * https://github.com/hyperledger-labs/acapy-java-client
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.out_of_band;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class InvitationCreateRequest {
    private String alias;
    private List<AttachmentDef> attachments;
    private List<String> handshakeProtocols;
    private String mediationId;
    private Object metadata;
    private String myLabel;
    private Boolean usePublicDid;
}
