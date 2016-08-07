package hyper.momitor.model;

import java.io.Serializable;

public class Host implements Serializable {
	private static final long serialVersionUID = -1573793986719124323L;

	private String hostId;
	private String hostName;

	private String os;
	private String osPlatform;
	private String osPlatformFamily;
	private String osPlatformVersion;

	private int cpuCores;
	private int cpuThreads;
	private String cpuModelName;
	private int cpuMhz;
	private int memSize;

	private String groupId;
	private String manageIp;

	/**
	 * @return the hostId
	 */
	public String getHostId() {
		return hostId;
	}

	/**
	 * @param hostId
	 *            the hostId to set
	 */
	public void setHostId(String hostId) {
		this.hostId = hostId;
	}

	/**
	 * @return the hostName
	 */
	public String getHostName() {
		return hostName;
	}

	/**
	 * @param hostName
	 *            the hostName to set
	 */
	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	/**
	 * @return the os
	 */
	public String getOs() {
		return os;
	}

	/**
	 * @param os
	 *            the os to set
	 */
	public void setOs(String os) {
		this.os = os;
	}

	/**
	 * @return the osPlatform
	 */
	public String getOsPlatform() {
		return osPlatform;
	}

	/**
	 * @param osPlatform
	 *            the osPlatform to set
	 */
	public void setOsPlatform(String osPlatform) {
		this.osPlatform = osPlatform;
	}

	/**
	 * @return the osPlatformFamily
	 */
	public String getOsPlatformFamily() {
		return osPlatformFamily;
	}

	/**
	 * @param osPlatformFamily
	 *            the osPlatformFamily to set
	 */
	public void setOsPlatformFamily(String osPlatformFamily) {
		this.osPlatformFamily = osPlatformFamily;
	}

	/**
	 * @return the osPlatformVersion
	 */
	public String getOsPlatformVersion() {
		return osPlatformVersion;
	}

	/**
	 * @param osPlatformVersion
	 *            the osPlatformVersion to set
	 */
	public void setOsPlatformVersion(String osPlatformVersion) {
		this.osPlatformVersion = osPlatformVersion;
	}

	/**
	 * @return the cpuCores
	 */
	public int getCpuCores() {
		return cpuCores;
	}

	/**
	 * @param cpuCores
	 *            the cpuCores to set
	 */
	public void setCpuCores(int cpuCores) {
		this.cpuCores = cpuCores;
	}

	/**
	 * @return the cpuThreads
	 */
	public int getCpuThreads() {
		return cpuThreads;
	}

	/**
	 * @param cpuThreads
	 *            the cpuThreads to set
	 */
	public void setCpuThreads(int cpuThreads) {
		this.cpuThreads = cpuThreads;
	}

	/**
	 * @return the cpuModelName
	 */
	public String getCpuModelName() {
		return cpuModelName;
	}

	/**
	 * @param cpuModelName
	 *            the cpuModelName to set
	 */
	public void setCpuModelName(String cpuModelName) {
		this.cpuModelName = cpuModelName;
	}

	/**
	 * @return the cpuMhz
	 */
	public int getCpuMhz() {
		return cpuMhz;
	}

	/**
	 * @param cpuMhz
	 *            the cpuMhz to set
	 */
	public void setCpuMhz(int cpuMhz) {
		this.cpuMhz = cpuMhz;
	}

	/**
	 * @return the memSize
	 */
	public int getMemSize() {
		return memSize;
	}

	/**
	 * @param memSize
	 *            the memSize to set
	 */
	public void setMemSize(int memSize) {
		this.memSize = memSize;
	}

	/**
	 * @return the groupId
	 */
	public String getGroupId() {
		return groupId;
	}

	/**
	 * @param groupId
	 *            the groupId to set
	 */
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	/**
	 * @return the manageIp
	 */
	public String getManageIp() {
		return manageIp;
	}

	/**
	 * @param manageIp
	 *            the manageIp to set
	 */
	public void setManageIp(String manageIp) {
		this.manageIp = manageIp;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Host [" + (hostId != null ? "hostId=" + hostId + ", " : "")
				+ (hostName != null ? "hostName=" + hostName + ", " : "") + (os != null ? "os=" + os + ", " : "")
				+ (osPlatform != null ? "osPlatform=" + osPlatform + ", " : "")
				+ (osPlatformFamily != null ? "osPlatformFamily=" + osPlatformFamily + ", " : "")
				+ (osPlatformVersion != null ? "osPlatformVersion=" + osPlatformVersion + ", " : "") + "cpuCores="
				+ cpuCores + ", cpuThreads=" + cpuThreads + ", "
				+ (cpuModelName != null ? "cpuModelName=" + cpuModelName + ", " : "") + "cpuMhz=" + cpuMhz
				+ ", memSize=" + memSize + ", " + (groupId != null ? "groupId=" + groupId + ", " : "")
				+ (manageIp != null ? "manageIp=" + manageIp : "") + "]";
	}

}
