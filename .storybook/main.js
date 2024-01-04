/** @type { import('@storybook/react-webpack5').StorybookConfig } */
const config = {
  stories: ["../public/js/stories/*_stories.js"],
  addons: [
    "@storybook/addon-links",
    "@storybook/addon-essentials",
    "@storybook/addon-onboarding",
    "@storybook/addon-interactions",
  ],
  framework: {
    name: "@storybook/react-webpack5",
    options: {
      builder: {
        useSWC: true,
      },
    },
  },
  docs: {
    autodocs: "tag",
  },
  features: {
    storyStoreV7: false, // 👈 Opt out of on-demand story loading
  },
};
export default config;
