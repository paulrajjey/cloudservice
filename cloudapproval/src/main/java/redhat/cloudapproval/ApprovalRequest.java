package redhat.cloudapproval;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ApprovalRequest implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String userTag;
   private java.lang.String serviceTag;
   private java.lang.String productTag;
   private java.lang.String requester;
   private java.lang.String serviceName;

   public ApprovalRequest()
   {
   }

   public java.lang.String getUserTag()
   {
      return this.userTag;
   }

   public void setUserTag(java.lang.String userTag)
   {
      this.userTag = userTag;
   }

   public java.lang.String getServiceTag()
   {
      return this.serviceTag;
   }

   public void setServiceTag(java.lang.String serviceTag)
   {
      this.serviceTag = serviceTag;
   }

   public java.lang.String getProductTag()
   {
      return this.productTag;
   }

   public void setProductTag(java.lang.String productTag)
   {
      this.productTag = productTag;
   }

   public java.lang.String getRequester()
   {
      return this.requester;
   }

   public void setRequester(java.lang.String requester)
   {
      this.requester = requester;
   }

   public java.lang.String getServiceName()
   {
      return this.serviceName;
   }

   public void setServiceName(java.lang.String serviceName)
   {
      this.serviceName = serviceName;
   }

   public ApprovalRequest(java.lang.String userTag,
         java.lang.String serviceTag, java.lang.String productTag,
         java.lang.String requester, java.lang.String serviceName)
   {
      this.userTag = userTag;
      this.serviceTag = serviceTag;
      this.productTag = productTag;
      this.requester = requester;
      this.serviceName = serviceName;
   }

}