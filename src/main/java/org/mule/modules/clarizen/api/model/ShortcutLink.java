/**
 * Mule Clarizen Cloud Connector
 *
 * (c) 2003-2014 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.modules.clarizen.api.model;

import com.clarizen.api.EntityId;

public class ShortcutLink extends ClarizenEntity {
    
        private EntityId parent;
        private EntityId child;
        private Double impactWeight;
        private Integer sequence;
        private Boolean shortcut;
        private Integer attachToRoadmap;

        public EntityId getParent() {
            return parent;
        }
        public EntityId getChild() {
            return child;
        }
        public Double getImpactWeight() {
            return impactWeight;
        }
        public Integer getSequence() {
            return sequence;
        }
        public Boolean getShortcut() {
            return shortcut;
        }
        public Integer getAttachToRoadmap() {
            return attachToRoadmap;
        }
        public void setParent(EntityId parent) {
            this.parent = parent;
        }
        public void setChild(EntityId child) {
            this.child = child;
        }
        public void setImpactWeight(Double impactWeight) {
            this.impactWeight = impactWeight;
        }
        public void setSequence(Integer sequence) {
            this.sequence = sequence;
        }
        public void setShortcut(Boolean shortcut) {
            this.shortcut = shortcut;
        }
        public void setAttachToRoadmap(Integer attachToRoadmap) {
            this.attachToRoadmap = attachToRoadmap;
        }

}
