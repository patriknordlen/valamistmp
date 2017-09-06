package com.arcusys.learn.liferay.model

import com.arcusys.learn.liferay.LiferayClasses.LHitsOpenSearchImpl
import com.arcusys.learn.liferay.util.IndexerRegistryUtilHelper

abstract class ValamisBaseOpenSearchImpl extends LHitsOpenSearchImpl {

  override def getIndexer = IndexerRegistryUtilHelper.getIndexer(getClassName)

  override def getPortletId: String

  def getClassName: String
}