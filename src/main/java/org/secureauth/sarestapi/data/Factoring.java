package org.secureauth.sarestapi.data;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author rrowcliffe@secureauth.com
 *
Copyright (c) 2015, SecureAuth
All rights reserved.

Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:

1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.

2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.

3. Neither the name of the copyright holder nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS;
OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
**/

@XmlRootElement(name="factoring")
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class Factoring {

        private double country_risk_factor;
        private int region_risk_factor;
        private int ip_resolve_factor;
        private int asn_record_factor;
        private int asn_threat_factor;
        private int bgp_delegation_factor;
        private int iana_allocation_factor;
        private int ipviking_personal_factor;
        private int ipviking_category_factor;
        private int ipviking_geofilter_factor;
        private int ipviking_geofilter_rule;
        private int data_age_factor;
        private int geomatch_distance;
        private int geomatch_factor;
        private int search_volume_factor;

        public double getCountry_risk_factor() {
                return country_risk_factor;
        }

        public void setCountry_risk_factor(double country_risk_factor) {
                this.country_risk_factor = country_risk_factor;
        }

        public int getRegion_risk_factor() {
                return region_risk_factor;
        }

        public void setRegion_risk_factor(int region_risk_factor) {
                this.region_risk_factor = region_risk_factor;
        }

        public int getIp_resolve_factor() {
                return ip_resolve_factor;
        }

        public void setIp_resolve_factor(int ip_resolve_factor) {
                this.ip_resolve_factor = ip_resolve_factor;
        }

        public int getAsn_record_factor() {
                return asn_record_factor;
        }

        public void setAsn_record_factor(int asn_record_factor) {
                this.asn_record_factor = asn_record_factor;
        }

        public int getAsn_threat_factor() {
                return asn_threat_factor;
        }

        public void setAsn_threat_factor(int asn_threat_factor) {
                this.asn_threat_factor = asn_threat_factor;
        }

        public int getBgp_delegation_factor() {
                return bgp_delegation_factor;
        }

        public void setBgp_delegation_factor(int bgp_delegation_factor) {
                this.bgp_delegation_factor = bgp_delegation_factor;
        }

        public int getIana_allocation_factor() {
                return iana_allocation_factor;
        }

        public void setIana_allocation_factor(int iana_allocation_factor) {
                this.iana_allocation_factor = iana_allocation_factor;
        }

        public int getIpviking_personal_factor() {
                return ipviking_personal_factor;
        }

        public void setIpviking_personal_factor(int ipviking_personal_factor) {
                this.ipviking_personal_factor = ipviking_personal_factor;
        }

        public int getIpviking_category_factor() {
                return ipviking_category_factor;
        }

        public void setIpviking_category_factor(int ipviking_category_factor) {
                this.ipviking_category_factor = ipviking_category_factor;
        }

        public int getIpviking_geofilter_factor() {
                return ipviking_geofilter_factor;
        }

        public void setIpviking_geofilter_factor(int ipviking_geofilter_factor) {
                this.ipviking_geofilter_factor = ipviking_geofilter_factor;
        }

        public int getIpviking_geofilter_rule() {
                return ipviking_geofilter_rule;
        }

        public void setIpviking_geofilter_rule(int ipviking_geofilter_rule) {
                this.ipviking_geofilter_rule = ipviking_geofilter_rule;
        }

        public int getData_age_factor() {
                return data_age_factor;
        }

        public void setData_age_factor(int data_age_factor) {
                this.data_age_factor = data_age_factor;
        }

        public int getGeomatch_distance() {
                return geomatch_distance;
        }

        public void setGeomatch_distance(int geomatch_distance) {
                this.geomatch_distance = geomatch_distance;
        }

        public int getGeomatch_factor() {
                return geomatch_factor;
        }

        public void setGeomatch_factor(int geomatch_factor) {
                this.geomatch_factor = geomatch_factor;
        }

        public int getSearch_volume_factor() {
                return search_volume_factor;
        }

        public void setSearch_volume_factor(int search_volume_factor) {
                this.search_volume_factor = search_volume_factor;
        }

        @Override
        public String toString(){
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("\n\t\t\t").append("Country Risk Factor:").append(country_risk_factor);
                stringBuilder.append("\n\t\t\t").append("Region Risk Factor:").append(region_risk_factor);
                stringBuilder.append("\n\t\t\t").append("IP Resolve Factor:").append(ip_resolve_factor);
                stringBuilder.append("\n\t\t\t").append("ASN Record Factor:").append(asn_record_factor);
                stringBuilder.append("\n\t\t\t").append("ASN Threat Factor:").append(asn_threat_factor);
                stringBuilder.append("\n\t\t\t").append("BGP Delegation Factor:").append(bgp_delegation_factor);
                stringBuilder.append("\n\t\t\t").append("IANA Allocation Factor:").append(iana_allocation_factor);
                stringBuilder.append("\n\t\t\t").append("IPViking Personal Factor:").append(ipviking_personal_factor);
                stringBuilder.append("\n\t\t\t").append("IPViking Category Factor:").append(ipviking_category_factor);
                stringBuilder.append("\n\t\t\t").append("IPViking Geofilter Factor:").append(ipviking_geofilter_factor);
                stringBuilder.append("\n\t\t\t").append("Data Age Factor:").append(data_age_factor);
                stringBuilder.append("\n\t\t\t").append("GEOMatch Distance:").append(geomatch_distance);
                stringBuilder.append("\n\t\t\t").append("GEOMatch Factor:").append(geomatch_factor);
                stringBuilder.append("\n\t\t\t").append("Search Volume Factor:").append(search_volume_factor);

                return stringBuilder.toString();
        }
}
