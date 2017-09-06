package com.arcusys.learn.liferay.services

import com.arcusys.learn.liferay.LiferayClasses.LServiceContext
import com.liferay.portal.kernel.service.ServiceContextThreadLocal

object ServiceContextHelper {
  def getServiceContext: LServiceContext = ServiceContextThreadLocal.getServiceContext

}
