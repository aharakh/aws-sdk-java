/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#updateSAMLProvider(UpdateSAMLProviderRequest) UpdateSAMLProvider operation}.
 * <p>
 * Updates the metadata document for an existing SAML provider.
 * </p>
 * <p>
 * <b>NOTE:</b>This operation requires Signature Version 4.
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#updateSAMLProvider(UpdateSAMLProviderRequest)
 */
public class UpdateSAMLProviderRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * An XML document generated by an identity provider (IdP) that supports
     * SAML 2.0. The document includes the issuer's name, expiration
     * information, and keys that can be used to validate the SAML
     * authentication response (assertions) that are received from the IdP.
     * You must generate the metadata document using the identity management
     * software that is used as your organization's IdP.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1000 - 10000000<br/>
     */
    private String sAMLMetadataDocument;

    /**
     * The Amazon Resource Name (ARN) of the SAML provider to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String sAMLProviderArn;

    /**
     * An XML document generated by an identity provider (IdP) that supports
     * SAML 2.0. The document includes the issuer's name, expiration
     * information, and keys that can be used to validate the SAML
     * authentication response (assertions) that are received from the IdP.
     * You must generate the metadata document using the identity management
     * software that is used as your organization's IdP.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1000 - 10000000<br/>
     *
     * @return An XML document generated by an identity provider (IdP) that supports
     *         SAML 2.0. The document includes the issuer's name, expiration
     *         information, and keys that can be used to validate the SAML
     *         authentication response (assertions) that are received from the IdP.
     *         You must generate the metadata document using the identity management
     *         software that is used as your organization's IdP.
     */
    public String getSAMLMetadataDocument() {
        return sAMLMetadataDocument;
    }
    
    /**
     * An XML document generated by an identity provider (IdP) that supports
     * SAML 2.0. The document includes the issuer's name, expiration
     * information, and keys that can be used to validate the SAML
     * authentication response (assertions) that are received from the IdP.
     * You must generate the metadata document using the identity management
     * software that is used as your organization's IdP.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1000 - 10000000<br/>
     *
     * @param sAMLMetadataDocument An XML document generated by an identity provider (IdP) that supports
     *         SAML 2.0. The document includes the issuer's name, expiration
     *         information, and keys that can be used to validate the SAML
     *         authentication response (assertions) that are received from the IdP.
     *         You must generate the metadata document using the identity management
     *         software that is used as your organization's IdP.
     */
    public void setSAMLMetadataDocument(String sAMLMetadataDocument) {
        this.sAMLMetadataDocument = sAMLMetadataDocument;
    }
    
    /**
     * An XML document generated by an identity provider (IdP) that supports
     * SAML 2.0. The document includes the issuer's name, expiration
     * information, and keys that can be used to validate the SAML
     * authentication response (assertions) that are received from the IdP.
     * You must generate the metadata document using the identity management
     * software that is used as your organization's IdP.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1000 - 10000000<br/>
     *
     * @param sAMLMetadataDocument An XML document generated by an identity provider (IdP) that supports
     *         SAML 2.0. The document includes the issuer's name, expiration
     *         information, and keys that can be used to validate the SAML
     *         authentication response (assertions) that are received from the IdP.
     *         You must generate the metadata document using the identity management
     *         software that is used as your organization's IdP.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateSAMLProviderRequest withSAMLMetadataDocument(String sAMLMetadataDocument) {
        this.sAMLMetadataDocument = sAMLMetadataDocument;
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) of the SAML provider to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return The Amazon Resource Name (ARN) of the SAML provider to update.
     */
    public String getSAMLProviderArn() {
        return sAMLProviderArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the SAML provider to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param sAMLProviderArn The Amazon Resource Name (ARN) of the SAML provider to update.
     */
    public void setSAMLProviderArn(String sAMLProviderArn) {
        this.sAMLProviderArn = sAMLProviderArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the SAML provider to update.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param sAMLProviderArn The Amazon Resource Name (ARN) of the SAML provider to update.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateSAMLProviderRequest withSAMLProviderArn(String sAMLProviderArn) {
        this.sAMLProviderArn = sAMLProviderArn;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSAMLMetadataDocument() != null) sb.append("SAMLMetadataDocument: " + getSAMLMetadataDocument() + ",");
        if (getSAMLProviderArn() != null) sb.append("SAMLProviderArn: " + getSAMLProviderArn() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSAMLMetadataDocument() == null) ? 0 : getSAMLMetadataDocument().hashCode()); 
        hashCode = prime * hashCode + ((getSAMLProviderArn() == null) ? 0 : getSAMLProviderArn().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateSAMLProviderRequest == false) return false;
        UpdateSAMLProviderRequest other = (UpdateSAMLProviderRequest)obj;
        
        if (other.getSAMLMetadataDocument() == null ^ this.getSAMLMetadataDocument() == null) return false;
        if (other.getSAMLMetadataDocument() != null && other.getSAMLMetadataDocument().equals(this.getSAMLMetadataDocument()) == false) return false; 
        if (other.getSAMLProviderArn() == null ^ this.getSAMLProviderArn() == null) return false;
        if (other.getSAMLProviderArn() != null && other.getSAMLProviderArn().equals(this.getSAMLProviderArn()) == false) return false; 
        return true;
    }
    
}
    